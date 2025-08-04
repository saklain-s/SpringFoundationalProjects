package com.luv2code.springboot.demo.mycooleap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class democontroller {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world!";
    }
}
