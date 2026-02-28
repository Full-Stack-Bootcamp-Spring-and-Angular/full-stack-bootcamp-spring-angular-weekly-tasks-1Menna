package com.myApp.model;

import javax.persistence.*;

@Entity
@Table(name="product_details")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_details_id")
    Product_Details productDetails ;
    String name;
}
