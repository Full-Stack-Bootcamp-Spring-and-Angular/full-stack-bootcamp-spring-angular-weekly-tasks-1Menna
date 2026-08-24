package com.example.springJwt.service;

import com.example.springJwt.entity.User;
import io.jsonwebtoken.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 JWT Service responsible for
 1- "Token Generation" by Combining (header + payload + signature)
    using the secret key and defined expiration time to construct a compact JWT string.

 2- "Claims Extraction"
    by parsing تحليل the token's payload using the secret key
    to retrieve specific information
    such as the subject (username/email), expiration date, and custom user claims.

 3- "Token Validation" by verifying the signature against the secret key
    to ensure data integrity, checking that the expiration date has not passed,
    and matching the extracted username against the target UserDetails.
 */
@Service
public class JWTService {

    private final String secret_key = "404E635266556A586E3272357538782F413F4428472B4B6250655368566D5971";
    private final long accessTokenValidity = 15*60*1000; // Valid till 15 min, convert min to millisecond
    private final JwtParser jwtParser; // for parsing token

    public JWTService() {
        this.jwtParser = Jwts.parser().setSigningKey(secret_key).build();
    }

    // 1- Generate Token that will be sent in the response for first request
    String createToken(User user, Map<String,Object>claims){
        return Jwts.builder().
                setClaims(claims)
                .setSubject(user.getEmail())
                .setExpiration(new Date(System.currentTimeMillis() + accessTokenValidity))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .signWith(SignatureAlgorithm.HS256, secret_key)
                .compact();
    }

    // 2- get Token from upComing requests' Authorization header
    public String resolveToken(HttpServletRequest request)
    {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            return authHeader.substring(7);
        }
        return null;
    }

    // 4- get Claims from current Token
    public Claims resolveClaims(HttpServletRequest req)
    {
        try {
            String token = resolveToken(req);
            if (token != null) {
                return parseJwtClaims(token);
            }
            return null;
        } catch (ExpiredJwtException ex) {
            req.setAttribute("expired", ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            req.setAttribute("invalid", ex.getMessage());
            throw ex;
        }
    }

    // 5- Helper method to parse the JWT string using JwtParser and extract its claims (payload)
    private Claims parseJwtClaims(String token)
    {
        return jwtParser.parseClaimsJws(token).getBody();
    }

    // 6- get roles of user from its claims
    private List<String> getRoles(Claims claims) {
        return (List<String>) claims.get("roles");
    }

    // ===================================================================================================
    // 7- For Token Validation
    public boolean isTokenValid(String accessToken , UserDetails userDetails) {
        String username = userDetails.getUsername();
        Claims claims = parseJwtClaims(accessToken);
        return username.equals(claims.getSubject()) && !isTokenExpired(claims.getExpiration());
    }

    public boolean isTokenExpired(Date expirationDate) throws AuthenticationException
    {
        try {
            if(expirationDate.before(new Date()))
                return true;
            else
                return false;
        } catch (Exception e) {
            throw e;
        }
    }
    // ===================================================================================================


}
