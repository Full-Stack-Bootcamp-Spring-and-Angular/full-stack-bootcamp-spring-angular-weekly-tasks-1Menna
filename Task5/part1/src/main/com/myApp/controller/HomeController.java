package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("year") String year , @RequestParam("month") String month, @RequestParam("day") String day, Model model)
    {


        //step2: add name to model
        model.addAttribute("year" , year);
        model.addAttribute("month" , month);
        model.addAttribute("day" , day);

        //step3: return view page
        return "resultPage";
    }
}


