package com.example.springJwt.repository;

import com.example.springJwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByEmail(String emaiL);
}
