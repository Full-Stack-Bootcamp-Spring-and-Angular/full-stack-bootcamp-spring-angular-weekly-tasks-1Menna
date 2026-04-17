package com.example.Project2.service;

import com.example.Project2.model.Product;

import java.util.List;

public interface ProductService {
    public void add(Product product);

    public Product get(int id);

    public void update(int id, Product product) ;

    public void Delete(int id);

    public List<Product> getAllProducts();
}
