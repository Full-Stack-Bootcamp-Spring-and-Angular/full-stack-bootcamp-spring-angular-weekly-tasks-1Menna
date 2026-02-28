package com.myApp.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="product_details")
public class Product_Details {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    int id;

    @Column(name="manufacturer")
    String manufacturer;

    @Column(name="price")
    double price;

    @Column(name="available")
    int available;

    @Temporal(TemporalType.DATE)
    @Column(name="expiration_date")
    Date expiration_date;

    @OneToOne(mappedBy = "productDetails", cascade = CascadeType.ALL) // only added for Bi-Direction
    Product product;

}
