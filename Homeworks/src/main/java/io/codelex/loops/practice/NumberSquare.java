package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        System.out.print("Min? ");
        Scanner firstInput = new Scanner(System.in);
        int minNumber = firstInput.nextInt();

        System.out.print("Max? ");
        Scanner secondInput = new Scanner(System.in);
        int maxNumber = firstInput.nextInt();

        int range = maxNumber - minNumber + 1;

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                int currentNumber = (minNumber + i + j - minNumber) % range + minNumber;
                System.out.print(currentNumber + " ");
            }
            System.out.println();
        }
    }
}
