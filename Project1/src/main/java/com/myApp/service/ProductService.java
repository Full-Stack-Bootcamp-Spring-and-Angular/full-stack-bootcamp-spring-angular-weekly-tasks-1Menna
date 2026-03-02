package com.myApp.service;

import com.myApp.dao.ProductDAO;
import com.myApp.model.Product;
import com.myApp.model.Product_Details;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public void insert(Product_Details product_details){
        Product product = new Product(product_details.getName());
        product.setProductDetails(product_details);
        productDAO.insert(product);
    }

    public void update(Product_Details product_details){
        productDAO.update(product_details);
    }
    public Product findById(int id){
        return productDAO.findById(id);
    }

    public List<Product> getAllProducts(){
        List<Product> productList = productDAO.getAllProducts();
        return  productList;
    }

}
