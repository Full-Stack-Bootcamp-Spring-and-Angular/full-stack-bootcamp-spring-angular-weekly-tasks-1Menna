package main.com.myApp.controller;

import main.com.myApp.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController
{

    Dao dao;

    @Autowired
    public void setDatabaseOperations(Dao dao) {
        this.dao = dao;
    }

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model){
        // get request parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String city = request.getParameter("city");

        // Save to Database
        dao.InsertIntoToDatabase(firstName,lastName,email,date,city);

        //add name to model
        model.addAttribute("firstName" , firstName);
        model.addAttribute("lastName" , lastName);
        model.addAttribute("email" , email);
        model.addAttribute("date" , date);
        model.addAttribute("city" , city);

        //return view page
        return "confirmPage";
    }
}


