package com.luv2code.springdemo.javaBasedAnnotations;

public class FamilyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "What does your family mean for you?";
    }
}
