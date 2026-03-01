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

    public Product_Details(String manufacturer, double price, int available, Date expiration_date) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.available = available;
        this.expiration_date = expiration_date;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
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

    public double getPrice() {
        return price;
    }

    public int getAvailable() {
        return available;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public Product getProduct() {
        return product;
    }
}
