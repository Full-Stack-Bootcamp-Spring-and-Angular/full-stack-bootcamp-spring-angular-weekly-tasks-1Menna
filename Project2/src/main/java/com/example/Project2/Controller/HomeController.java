package com.example.Project2.controller;

import com.example.Project2.service.ProductServiceImpl;
import com.example.Project2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/product")
    public Product insertProduct(@RequestBody Product product){
        productService.add(product);
        return product;
    }

    @GetMapping ("/product/{id}")
    public Product getProduct(@PathVariable int id){
        return productService.get(id);
    }

    @PutMapping ("/product/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        productService.update(id,product);
    }

    @DeleteMapping ("/product")
    public void deleteProduct(@RequestParam("id") int id){
        productService.Delete(id);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


}
