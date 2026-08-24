package com.example.springJwt.controller;

import com.example.springJwt.model.request.AuthenticationResponse;
import com.example.springJwt.model.request.LoginRequest;
import com.example.springJwt.model.request.RegisterRequest;
import com.example.springJwt.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rest/auth")
public class AuthController {

    @Autowired
    private AuthenticationService authService;


    @PostMapping(value = "/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest loginRequest , @RequestParam Map<String , Object> claims)  {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest registerRequest)
    {
        return ResponseEntity.ok(authService.register(registerRequest));
    }
}
