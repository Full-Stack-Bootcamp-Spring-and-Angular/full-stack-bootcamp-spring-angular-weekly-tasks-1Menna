package com.example.Project2.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private Date expiration_date;

    public void setName(String name) {
        this.name = name;
    }
}

/*
use project2;

create table product(
        id int primary key auto_increment,
        name varchar(255),
manufacturer varchar(255),
price double,
expirationDate date
);

*/