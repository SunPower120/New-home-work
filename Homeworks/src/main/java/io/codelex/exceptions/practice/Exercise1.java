package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("Enter the numerator (type 'q' to quit)");
                String numeratorInput = scanner.next();

                if (numeratorInput.toLowerCase().startsWith("q")) {
                    System.out.println("Exiting the program...");
                    break;
                }

                int numerator = Integer.parseInt(numeratorInput);
                System.out.println("Enter the divisor");
                String divisorInput = scanner.next();

                if (divisorInput.toLowerCase().startsWith("q")) {
                    System.out.println("Exiting the program...");
                    break;
                }

                int divisor = Integer.parseInt(divisorInput);

                if (divisor == 0) {
                    System.out.println("Invalid divisor. Please enter a non-zero number.");
                    System.out.println();
                } else {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                    System.out.println();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid numerator or divisor. Please enter a number.");
                System.out.println();
                clearBuffer(scanner);

            }
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}