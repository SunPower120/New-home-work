package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter single string");
        String input = scanner.nextLine();

        int uppercaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }

        System.out.println("Input was: \"" + input + "\" and it contains " + uppercaseCount + " uppercase letters");
    }
}
