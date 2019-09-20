package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class FileFortuneService implements FortuneService {

    private String fileName = "E:/DEV/fortune-data.txt";
    private List<String> theFortunes;

    //create a random number generator
    private Random myRandom = new Random();

    public FileFortuneService() {

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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(theFortunes.size());
        String tempFortune = theFortunes.get(index);
        return tempFortune;
    }
}
