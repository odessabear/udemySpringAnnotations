package com.luv2code.springdemo.javaBasedAnnotations;

import com.luv2code.springdemo.annotationsWithXML.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //        read spring config

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//        get the bean from spring container

        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
//        call a method on the bean

        System.out.println(theCoach.GetDailyWorkout());

        //call method to get the daily Fortune Service

        System.out.println(theCoach.getDailyFortune());

        //call our new methods

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

//      close the context
        context.close();
    }
}
