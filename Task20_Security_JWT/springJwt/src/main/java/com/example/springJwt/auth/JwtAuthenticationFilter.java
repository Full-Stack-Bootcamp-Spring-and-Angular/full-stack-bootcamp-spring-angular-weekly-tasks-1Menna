package com.example.springJwt.auth;

import com.example.springJwt.service.JWTService;
import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    JWTService jwtService;

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try{
            String authHeader = request.getHeader("Authorization");

            // If it has No Token, Then go to next Filter
            if(authHeader ==null || !authHeader.startsWith("Bearer")){
                filterChain.doFilter(request, response);
            }

            // take userEmail from this token
            String accessToken = authHeader.substring(7);
            Claims claims = jwtService.resolveClaims(request);
            String userEmail = claims.getSubject();

            // check if it authenticated or not (means SecurityContextHolder empty or not)
            if(userEmail!= null && SecurityContextHolder.getContext().getAuthentication() == null){
                // load user from database
                // Here we Use "Polymorphism", calling father which will in runtime choose child
                UserDetails userDetails = userDetailsService.loadUserByUsername(userEmail);
                if(userDetails != null && jwtService.isTokenValid(accessToken,userDetails)){
                    Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());

                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        // in All Cases, move to Next Filter
        filterChain.doFilter(request, response);
    }

}
