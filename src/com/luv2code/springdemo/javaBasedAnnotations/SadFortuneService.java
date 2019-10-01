package com.luv2code.springdemo.javaBasedAnnotations;

import com.luv2code.springdemo.annotationsWithXML.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
