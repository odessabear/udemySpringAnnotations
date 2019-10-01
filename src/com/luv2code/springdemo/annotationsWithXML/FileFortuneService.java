package com.luv2code.springdemo.annotationsWithXML;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private String fileName = "E:/DEV/fortune-data.txt";
    private List<String> theFortunes;

    //create a random number generator
    private Random myRandom = new Random();

    public FileFortuneService() {
        System.out.println("FileFortuneService default constructor");
    }

    @PostConstruct
    private void setFileFortuneService() {
        System.out.println("Inside PostConstruct method");
        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("file exists: " + theFile.exists());

        //initialize array list
        theFortunes = new ArrayList<>();

        //read fortunes from file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(theFile))) {
            String tempLine;

            while ((tempLine = bufferedReader.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        @Override
        public String getFortune () {
            int index = myRandom.nextInt(theFortunes.size());
            String tempFortune = theFortunes.get(index);
            return tempFortune;
        }
    }

