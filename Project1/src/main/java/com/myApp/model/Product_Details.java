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

    @Column(name="name")
    String name;

    @Column(name="manufacturer")
    String manufacturer;

    @Column(name="price")
    double price;

    @Column(name="available")
    int available;

    @Temporal(TemporalType.DATE)
    @Column(name="expiration_date")
    Date expirationDate;

    @OneToOne(mappedBy = "productDetails", cascade = CascadeType.ALL) // only added for Bi-Direction
    Product product;

    public Product_Details(String name, String manufacturer, double price, int available, Date expiration_date) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.available = available;
        this.expirationDate = expiration_date;
    }


    // Will remove it later and add lombok

    public Product_Details() {

    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setExpirationDate(Date expiration_date) {
        this.expirationDate = expiration_date;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // getters

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailable() {
        return available;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Product getProduct() {
        return product;
    }
}
