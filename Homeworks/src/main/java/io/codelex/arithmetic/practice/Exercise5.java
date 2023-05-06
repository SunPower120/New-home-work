package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int inputInteger = scanner.nextInt();

        Random random = new Random();
        int randomInteger = random.nextInt(100) + 1;

        if (randomInteger>inputInteger) {
            System.out.println("Sorry, you are too low.  I was thinking of " +randomInteger);
        } else if (randomInteger<inputInteger) {
            System.out.println("Sorry, you are too high.  I was thinking of " +randomInteger);
        }
        else System.out.println("You guessed it!  What are the odds?!?");
    }
}

