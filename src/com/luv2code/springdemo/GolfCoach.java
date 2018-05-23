package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    @Override
    public String GetDailyWorkout() {
        return "I'm always trying to win!";
    }
}
