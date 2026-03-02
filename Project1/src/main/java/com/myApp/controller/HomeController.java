package com.myApp.controller;

import com.myApp.dao.ProductDAO;
import com.myApp.dao.ProductDAO_Impl;
import com.myApp.model.Product;
import com.myApp.model.Product_Details;
import com.myApp.service.ProductService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Transactional
@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

    @RequestMapping("/")
    public String homePage(Model model)
    {
        List<Product> productsList = productService.getAllProducts();
        model.addAttribute("productsList", productsList);
        return "homePage";
    }

    //====================================================================================
    @RequestMapping("/addProduct")
    public String addProductPage(Model model) // send empty obj to form, so it fill it
    {
        model.addAttribute("productModel", new Product_Details());
        return "addProductForm";
    }

    @RequestMapping("/processAddProduct")
    public String processAddProduct(@ModelAttribute("productModel") Product_Details productDetails, Model model){
        productService.insert(productDetails);

        return "redirect:/";
    }
    //====================================================================================
    @RequestMapping("/updateProduct")
    public String updateProductPage(@RequestParam("id") int id ,Model model) // send empty obj to form, so it fill it
    {
        Product product = productService.findById(id);
        model.addAttribute("productModel", product.getProductDetails());
        return "updateDetailsForm";
    }

    @RequestMapping("/processUpdateProductForm")
    public String processUpdateProductForm(@ModelAttribute("productModel") Product_Details productDetails, Model model){
        productService.update(productDetails);

        return "redirect:/";
    }
    //====================================================================================
    @RequestMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("id") int id,Model model) // send empty obj to form, so it fill it
    {
        productService.deleteById(id);

        return "redirect:/";
    }
    //====================================================================================
    @RequestMapping("/showProductDetails")
    public String showProductDetails(@RequestParam("id") int id, Model model){

        Product product = productService.findById(id);
        model.addAttribute("productModel",product.getProductDetails());
        return  "viewDetailsPage";
    }

}
