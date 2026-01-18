package main.com.myApp.controller;

import main.com.myApp.Models.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController
{


    @RequestMapping("/")
    public String showHomePage(Model model)
    {
         model.addAttribute("userModel",new UserModel()); // send empty obj to form, so it fill it
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("userModel") UserModel userModel, Model model){

        model.addAttribute("userModelResult" , userModel);

        return "confirmPage";
    }
}


