package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    //This is a "random" class
    public static void main(String[] args) {
        //This is a "random" class
        Random rand = new Random();
        String[] animalArray = {"cat", "dog", "duck", "capybara", "tiger", "canary", "chicken", "crow", "crab", "monkey"};


        int randomNumber = rand.nextInt(10);
        String animal = animalArray[randomNumber];

        int tryCount = animal.length();
        while (true) {
            System.out.println("Guess an animal.");

            Scanner scanner = new Scanner(System.in);
            String playerGuess = scanner.nextLine();
            tryCount--;
            if (animal.contains(playerGuess)) {
                System.out.println("correct guess ");
            }   else
            {
                System.out.println("incorrect! number of tries remaining: " + tryCount);
            }
        }
    }

}
