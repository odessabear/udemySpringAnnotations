package com.luv2code.springdemo.annotationsWithXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //        read spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        get the bean from spring container

        Coach theCoach = context.getBean("golfCoach", Coach.class);
//        call a method on the bean

        System.out.println(theCoach.GetDailyWorkout());

        //call method to get the daily Fortune Service

        System.out.println(theCoach.getDailyFortune());

//        close the context

        context.close();
    }
}
