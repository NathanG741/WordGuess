package com.github.zipcodewilmington;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Nathan Guardado
public class WordGuess {
    //This is a "random" class
    public static void main(String[] args) {
        //This is a "random" class

        Random rand = new Random();
        String[] animalArray = {"cat", "dog", "duck", "capybara", "tiger", "canary", "chicken", "crow", "crab", "monkey"};

        boolean gameActive = true;
        while (gameActive) {

            int randomNumber = rand.nextInt(10);
            String animal = animalArray[randomNumber];

            String[] chars = animal.split("");
            String[] blanks = new String[chars.length];

            Arrays.fill(blanks, "_");

            int tryCount = animal.length();
            while (true) {
                System.out.println(String.join(" ", blanks));
                System.out.println("Pick a letter");

                Scanner scanner = new Scanner(System.in);
                String playerGuess = scanner.nextLine();
                tryCount--;
                if (animal.contains(playerGuess)) {
                    System.out.println("correct guess ");
                    for (int i = 0; i < chars.length; i++) {
                        if (playerGuess.equalsIgnoreCase(chars[i])) {
                            blanks[i] = playerGuess;
                        }
                    }
                    if (!Arrays.asList(blanks).contains("_")) {
                        System.out.println("Pog you win");
                        break;
                    }

                } else {
                    if (tryCount == 0) {
                        System.out.println("Sadge you lose");
                        break;
                    }
                    System.out.println("incorrect! number of tries remaining: " + tryCount);
                }
            }
            System.out.println("Try again? Yes/No");
            Scanner scanner = new Scanner(System.in);
            String Answer = scanner.nextLine();
            if (Answer.equalsIgnoreCase("No")) {
                System.out.println("Goosebye :(" );
                gameActive = false;
            }
        }
    }
}
