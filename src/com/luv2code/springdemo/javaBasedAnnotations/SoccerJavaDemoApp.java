package com.luv2code.springdemo.javaBasedAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoccerJavaDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeSportConfig.class);

        Coach theCoach = context.getBean("soccerCoach",Coach.class);

        System.out.println(theCoach.GetDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
