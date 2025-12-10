package com.luv2code.springcoredemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Coach myCoach;

    public DemoController(Coach myCoach){
        this.myCoach = myCoach;
    }

    @GetMapping("/")
    public String method(){
        return myCoach.dailyWorkout();
    }
}