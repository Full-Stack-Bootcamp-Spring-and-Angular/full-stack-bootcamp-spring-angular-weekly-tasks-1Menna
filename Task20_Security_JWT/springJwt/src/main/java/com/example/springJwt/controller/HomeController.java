package com.example.springJwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping(value = "/rest/home")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }
}
