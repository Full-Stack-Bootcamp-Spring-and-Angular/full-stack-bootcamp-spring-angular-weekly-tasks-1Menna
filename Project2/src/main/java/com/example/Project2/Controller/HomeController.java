package com.example.Project2.Controller;

import com.example.Project2.Service.ProductService;
import com.example.Project2.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    ProductService productService;

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
