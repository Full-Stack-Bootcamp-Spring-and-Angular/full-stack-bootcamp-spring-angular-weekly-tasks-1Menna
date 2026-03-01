package com.myApp.model;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_details_id")
    Product_Details productDetails ;

    @Column(name="name")
    String name;


    public Product(String name) {
        this.name = name;
    }

    // Will remove it later and add lombok
    // NoArgConstructor
    public Product( ) {

    }
    // setters

    public void setId(int id) {
        this.id = id;
    }

    public void setProductDetails(Product_Details productDetails) {
        this.productDetails = productDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters

    public int getId() {
        return id;
    }

    public Product_Details getProductDetails() {
        return productDetails;
    }

    public String getName() {
        return name;
    }
}
