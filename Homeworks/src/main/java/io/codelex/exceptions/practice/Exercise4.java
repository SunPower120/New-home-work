package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String d = "";
        while (!d.equals("q")) {
            try {
                d = getInput();
                if (d.equals("q")) {
                    return;
                }
                double e = Double.parseDouble(d);
                if (e < 0) {
                    throw new NonPositiveNumberException("something will be with negative sign");
                }
                double root = Math.sqrt(e);
                System.out.println(
                        "The square root of " + d + " is " + root);
            } catch (NumberFormatException e) {
                System.out.println("Be sure to enter a number.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter number as first parameter.");
            } catch (NonPositiveNumberException e) {
                System.out.println("Result will be imaginary number.");
            }
        }
    }

    static String getInput() {
        System.out.println("Enter number (enter 'q' to quit):");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextLine();
        } catch (InputMismatchException e) {
            clearBuffer(scanner);
            throw e;
        }


    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
