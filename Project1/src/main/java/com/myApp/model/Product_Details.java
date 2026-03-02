package com.myApp.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Entity
@Table(name="product_details")
public class Product_Details {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    int id;

    @NotBlank(message ="this field cannot empty or null")
    @Column(name="name")
    String name;

    @NotBlank(message ="this field cannot empty or null")
    @Column(name="manufacturer")
    String manufacturer;

    @NotNull(message ="this field cannot empty or null")
    @Column(name="price")
    Double price;

    @Min(value = 0, message = "Available must be 0 or 1")
    @Max(value = 1, message = "Available must be 0 or 1")
    @NotNull(message ="this field cannot empty or null")
    @Column(name="available")
    Integer available;

    @NotNull(message ="this field cannot empty or null")
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

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailable(Integer available) {
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

    public Double getPrice() {
        return price;
    }

    public Integer getAvailable() {
        return available;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Product getProduct() {
        return product;
    }
}
