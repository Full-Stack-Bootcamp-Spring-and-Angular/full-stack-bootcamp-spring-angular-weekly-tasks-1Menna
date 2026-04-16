package com.example.Project2.service;

import com.example.Project2.dao.ProductRepository;
import com.example.Project2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    public void add(Product product){
        productRepository.save(product);
    }

    public Product get(int id){
        return productRepository.findById(id).orElse(null);
    }

    public void update(int id, Product product) {
        if (productRepository.existsById(id)) {
            product.setId(id);
            productRepository.save(product);
        }
    }

    public void Delete(int id){
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }


}
