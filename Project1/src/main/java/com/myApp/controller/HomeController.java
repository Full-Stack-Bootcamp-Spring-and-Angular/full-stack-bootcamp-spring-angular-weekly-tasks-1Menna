package com.myApp.controller;

import com.myApp.dao.ProductDAO;
import com.myApp.dao.ProductDAO_Impl;
import com.myApp.model.Product;
import com.myApp.model.Product_Details;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;

@Transactional
@Controller
public class HomeController {

    @Autowired
    private ProductDAO productDAO;

    @RequestMapping("/")
    public String homePage()
    {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Product_Details  details = new Product_Details("Pepsi Egypt",25000,1,dateFormat.parse("2029-09-01"));
            Product product = new Product("Chips");


            product.setProductDetails(details);

            // call DAO
            productDAO.insert(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "homePage";
    }

}
