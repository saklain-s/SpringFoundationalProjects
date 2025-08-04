package com.luv2code.springcoredemo.rest;


import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

   @Autowired

   public void setCoach(Coach theCoach){
       myCoach = theCoach;
   }
    @GetMapping("/dailywork")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkout();
    }
}
