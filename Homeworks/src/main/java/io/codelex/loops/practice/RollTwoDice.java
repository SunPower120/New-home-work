package io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        System.out.print("Desired sum: ");
        Scanner firstInput = new Scanner(System.in);
        int desiredSum = firstInput.nextInt();

        RandomGenerator localRandom = new RandomGenerator();

        if (desiredSum > 12) {
            System.out.println("Wrong input");
        }


        while (true) {
            int random1 = localRandom.generateRandomNumber();
            int random2 = localRandom.generateRandomNumber();
            int sumOfRandom = random1 + random2;

            System.out.println(random1 + " and " + random2 + " = " + sumOfRandom);


            if (sumOfRandom == desiredSum || desiredSum > 12) {
                break;
            }
        }
    }
}
