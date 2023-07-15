package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Set<String> names = new HashSet<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter name: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            names.add(userInput);
        }
        System.out.println(names);
    }
}
