package com.luv2code.springdemo.annotationsWithXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

//     @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }
    public TennisCoach(){
        System.out.println(" Tennis Default constructor");
    }

    //define my init method
   @PostConstruct
    public void doMyStartupStaff(){
        System.out.println(">> Tennis coach of doMyStartupStaff()");
    }

    // define destroy method
    @PreDestroy
    public void doCleanupStuff(){
        System.out.println(">> Tennis coach of doCleanupStuff()");
    }



//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method ");
//        fortuneService = theFortuneService;
//   }


//    @Autowired
//    public void doSomeCrazyStuff(FortuneService theFortuneService) {
//        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method ");
//
//        fortuneService = theFortuneService;
//    }

    @Override
    public String GetDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
