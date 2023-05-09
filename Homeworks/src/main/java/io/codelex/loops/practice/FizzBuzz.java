package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        int returnedInput = input();
        String allTogether = "";
        for (int i = 1; i < returnedInput; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                allTogether += "FizzBuzz ";
            } else if (i % 3 == 0) {
                allTogether += "Fizz ";
            } else if (i % 5 == 0) {
                allTogether += "Buzz ";
            } else allTogether += i + " ";

            if (i % 20 == 0) {
                allTogether += "\n";
            }
        }
        System.out.println(allTogether);
    }

    public static int input() {
        System.out.print("Enter integer: ");
        Scanner firstInput = new Scanner(System.in);
        return firstInput.nextInt();
    }
}