package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {

    public static void main(String[] args) {

        System.out.println("Welcome to Piglet");

        int counter = 0;
        int returnedChoice;
        RandomGenerator localRandom = new RandomGenerator();


        while (true) {
            int random1 = localRandom.generateRandomNumber();
            System.out.println("You rolled a " + random1);
            counter = counter + random1;
            if (random1 == 1) {
                counter = 0;
                break;
            }

            returnedChoice = choice();
            if (returnedChoice != 1) {
                break;
            }

        }

        System.out.println("You got " + counter + " points.");
    }

    public static int choice() {
        System.out.print("Roll again? ");
        Scanner firstInput = new Scanner(System.in);
        String firstInputString = firstInput.nextLine().toLowerCase();

        if (firstInputString.equals("yes") || firstInputString.equals("y")) {
            return 1;
        } else if (firstInputString.equals("no") || firstInputString.equals("n")) {
            return 2;
        } else return 3;

    }

}
