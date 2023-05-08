package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input random Integer:");
        Integer inputInteger = scanner.nextInt();

        if (inputInteger % 2 == 0) {
            System.out.println(inputInteger + " is even number" );
        }
        else System.out.println(inputInteger + " is odd number" );

        System.out.println("Thanks for using our magnificent app!");
    }
}

