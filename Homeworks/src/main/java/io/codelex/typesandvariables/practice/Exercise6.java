package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a series of single-digit numbers (separated by spaces):");
        String input = scanner.nextLine();

        int sum = 0;
        String[] numbers = input.split(" ");
        for (String number : numbers) {
            int digit = Integer.parseInt(number);
            sum += digit;
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
