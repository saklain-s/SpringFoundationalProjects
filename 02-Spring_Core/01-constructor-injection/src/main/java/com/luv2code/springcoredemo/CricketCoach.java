package com.luv2code.springcoredemo;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String dailyWorkout() {
        return "Do 10 KM run daily";
    }
}