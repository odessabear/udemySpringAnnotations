package com.luv2code.springdemo.javaBasedAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {


    @Bean
    public FortuneService familyFortuneService(){
        return new FamilyFortuneService();
    }


    @Bean
    public Coach soccerCoach(){
        return new SoccerCoach(familyFortuneService());
    }
}
