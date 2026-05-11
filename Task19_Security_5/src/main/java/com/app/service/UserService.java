package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    JdbcUserDetailsManager userDetailsManager;

    public void insertIntoSchema(String username, String password){
        String encodedPassword = passwordEncoder.encode(password);
        UserDetails user = User.withUsername(username)
                .password(encodedPassword)
                .roles("USER")
                .build();

        userDetailsManager.createUser(user);
    }
    
}
