package com.luv2code.springcoredemo.rest;


import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach cricketCoach;
    private final Coach tennisCoach;
    private final Coach baseballCoach;

   @Autowired
   public DemoController(@Qualifier("cricketCoach") Coach cricketCoach,
                         @Qualifier("tennisCoach") Coach tennisCoach,
                            @Qualifier("baseballCoach") Coach baseballCoach){
       this.cricketCoach = cricketCoach;
       this.tennisCoach = tennisCoach;
       this.baseballCoach = baseballCoach;
   }

   @GetMapping("dailywork/tennis")
   public String getDailyWorkout(){
       return tennisCoach.getDailyWorkout();
   }


    @GetMapping("/dailywork/cricket")
    public String getDailyWorkOut(){
        return cricketCoach.getDailyWorkout();
    }

    @GetMapping("/dailywork")
    public String dailyWorkoutSummary() {
        return "Use /dailywork/tennis for tennis info\n" +
                "Use /dailywork/cricket for cricket info\n" +
                "Use /dailywork/baseball for baseball info\n";
    }

    @GetMapping("/dailywork/baseball")
    public String baseballWorkOut(){
        return baseballCoach.getDailyWorkout();
    }
}
