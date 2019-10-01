package com.luv2code.springdemo.javaBasedAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //        read spring config

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//        get the bean from spring container

        com.luv2code.springdemo.javaBasedAnnotations.Coach theCoach = context.getBean("swimCoach", Coach.class);
//        call a method on the bean

        System.out.println(theCoach.GetDailyWorkout());

        //call method to get the daily Fortune Service

        System.out.println(theCoach.getDailyFortune());

//        close the context

        context.close();
    }
}
