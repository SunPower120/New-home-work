package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter number : ");
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            int number = Integer.parseInt(userInput);

            boolean isHappy = isHappyNumber(number);
            if (isHappy) {
                System.out.println(number + " is a happy number.");
            } else {
                System.out.println(number + " is not a happy number.");
            }
        }
    }

    private static boolean isHappyNumber(int number) {
        while (number != 1 && number != 4) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }
        return number == 1;
    }
}
