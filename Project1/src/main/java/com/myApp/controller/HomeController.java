package com.myApp.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Transactional
@Controller
public class HomeController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/")
    public String homePage()
    {
        try {
            Session session = sessionFactory.getCurrentSession();
            System.out.println("connection successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "homePage";
    }

}
