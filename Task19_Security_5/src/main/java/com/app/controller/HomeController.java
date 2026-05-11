package com.app.controller;

import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    UserService userService;


    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/admin")
    public String adminPage(){
        return "admin";
    }

    @RequestMapping("/system")
    public String systemPage(){
        return "system";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/accessDenied")
    public String accessDeniedPage(){
        return "accessDenied";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/addNewUser")
    public void addNewUser(@RequestParam("username") String username, @RequestParam("password") String password){
         userService.insertIntoSchema(username,password);
    }

}
