package com.luv2code.springdemo;

import com.luv2code.springdemo.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //        read spring config

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//        get the bean from spring container

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
//        call a method on the bean

        System.out.println(theCoach.GetDailyWorkout());

        //call method to get the daily Fortune Service

        System.out.println(theCoach.getDailyFortune());

//        close the context

        context.close();
    }
}
