package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {


    @Override
    public String GetDailyWorkout() {
        return "Practice your backend volley";
    }
}
