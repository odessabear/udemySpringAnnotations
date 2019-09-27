package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    public GolfCoach() {
        System.out.println(">> GolfCoach: inside default constructor");
    }

    @Override
    public String GetDailyWorkout() {
        return "I'm always trying to win!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
