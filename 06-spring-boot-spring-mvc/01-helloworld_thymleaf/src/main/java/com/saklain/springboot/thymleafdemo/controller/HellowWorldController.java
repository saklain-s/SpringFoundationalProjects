package com.saklain.springboot.thymleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HellowWorldController {

    // need a controller method to show initial html form
    @GetMapping("/showForm")
    public  String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // need a controller method to read form data and
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public  String  letsShoutDude(HttpServletRequest request, Model model){

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yoo! " + theName;

        // add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }


    @PostMapping("/processFormVersionThree")
    public  String  processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Hey My Friend v3! " + theName;

        // add message to the model
        model.addAttribute("message",result);

        return "helloworld";
    }
}
