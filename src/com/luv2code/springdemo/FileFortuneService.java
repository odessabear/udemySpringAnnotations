package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private String fileName = "D:/Development/fortune-data.txt";
    private List<String> thefortunes;

    //create a random number generator
    private Random myRandom = new Random();

    public FileFortuneService() {

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("file exists: " + theFile.exists());

        //initialize array list
        thefortunes = new ArrayList<String>();

        //read fortunes from file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(theFile))) {
            String tempLine;

            while ((tempLine = bufferedReader.readLine()) != null) {
                thefortunes.add(tempLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(thefortunes.size());
        String tempFortune = thefortunes.get(index);
        return tempFortune;
    }
}
