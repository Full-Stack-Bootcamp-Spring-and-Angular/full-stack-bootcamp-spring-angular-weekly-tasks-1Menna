package com.myApp.dao;

import com.myApp.model.Product;

import java.util.List;

public interface ProductDAO {

    Product insert(Product product);
    Product update(Product product);
    Product deleteById(int id);
    Product findById(int id);
    List<Product> getAllProducts();

}
