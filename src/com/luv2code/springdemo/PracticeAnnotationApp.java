package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("golfCoach",Coach.class);

        System.out.println(theCoach.GetDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
