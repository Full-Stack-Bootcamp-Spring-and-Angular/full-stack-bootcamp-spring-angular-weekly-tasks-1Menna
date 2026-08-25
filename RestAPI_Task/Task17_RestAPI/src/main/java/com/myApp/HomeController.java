package com.myApp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {


    @ResponseBody
    @RequestMapping("/test")
    public String homePage(){
        return "homePage";
    }

    @ResponseBody
    @RequestMapping("/student")
    public Student student(){
        return new Student(1,"ahmed",3.5);
    }




}
