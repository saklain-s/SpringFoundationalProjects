package com.luv2code.springcoredemo.rest;


import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.CachedIntrospectionResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach cricketCoach;
    private Coach baseballCoach;


   @Autowired
   public DemoController( @Qualifier("cricketCoach") Coach cricketCoach, @Qualifier("baseballCoach") Coach baseballCoach){
       this.cricketCoach = cricketCoach;
       this.baseballCoach = baseballCoach;
   }
    

    @GetMapping("/cricketCoach")
    public String getCricketWorkout(){
       return cricketCoach.getDailyWorkout();
    }

    @GetMapping("/baseball")
    public String getBaseballWorkout(){
       return baseballCoach.getDailyWorkout();
    }
}
