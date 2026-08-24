package com.example.springJwt.repository;

import com.example.springJwt.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token,Integer> {
    Token findByToken(String token);
}
