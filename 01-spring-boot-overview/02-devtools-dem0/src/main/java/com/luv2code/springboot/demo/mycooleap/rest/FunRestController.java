package com.luv2code.springboot.demo.mycooleap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Run 10k hard";
    }

    @GetMapping("/testing")
    public String testing(){
        return "Auto-matic testing";
    }
}
