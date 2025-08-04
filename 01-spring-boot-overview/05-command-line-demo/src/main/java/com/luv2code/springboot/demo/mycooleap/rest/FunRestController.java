package com.luv2code.springboot.demo.mycooleap.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }
    //expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5kl";

    }
    @GetMapping("/testing")
    public String test(){
        return "auto-matic running";

    }
}
