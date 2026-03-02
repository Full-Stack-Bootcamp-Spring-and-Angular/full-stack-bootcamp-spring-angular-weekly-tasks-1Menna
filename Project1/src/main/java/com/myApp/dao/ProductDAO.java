package com.myApp.dao;

import com.myApp.model.Product;
import com.myApp.model.Product_Details;

import java.util.List;

public interface ProductDAO {

    Product insert(Product product);
    Product_Details update(Product_Details product_details);
    void deleteById(int id);
    Product findById(int id);
    List<Product> getAllProducts();

}
