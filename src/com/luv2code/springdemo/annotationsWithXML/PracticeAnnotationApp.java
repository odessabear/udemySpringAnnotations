package com.luv2code.springdemo.annotationsWithXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        System.out.println(theCoach.GetDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
