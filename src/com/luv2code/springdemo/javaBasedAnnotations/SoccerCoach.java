package com.luv2code.springdemo.javaBasedAnnotations;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String GetDailyWorkout() {
        return "All you need is Coal!!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
