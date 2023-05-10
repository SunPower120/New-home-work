package io.codelex.arithmetic.practice;

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the unit system:");
        System.out.println("1. Metric (kg, centimeters)");
        System.out.println("2. Imperial (pounds, inches)");
        int choice = scanner.nextInt();

        double inputWeight;
        double inputHeight;

        if (choice == 1) {
            System.out.println("Enter your weight in kilograms:");
            inputWeight = scanner.nextDouble();

            System.out.println("Enter your height in centimeters:");
            inputHeight = scanner.nextDouble()/100;
        } else if (choice == 2) {
            System.out.println("Enter your weight in pounds:");
            inputWeight = scanner.nextDouble();

            System.out.println("Enter your height in inches:");
            inputHeight = scanner.nextDouble();
        } else {
            System.out.println("Invalid choice. Exiting the program.");
            return;
        }

        double bmiIndex;

        if (choice == 1) {
            bmiIndex = inputWeight / (inputHeight * inputHeight);
        } else {
            bmiIndex = inputWeight * 703 / (inputHeight * inputHeight);
        }

        if (18.5 < bmiIndex && bmiIndex < 25) {
            System.out.println("Your BMI index is " + String.format("%.2f",bmiIndex) + ". That is considered as optimal weight");
        } else if (bmiIndex < 18.5) {
            System.out.println("Your BMI index is " + String.format("%.2f",bmiIndex) + ". That is considered as underweight, you should eat more junk food");
        } else {
            System.out.println("Your BMI index is " + String.format("%.2f",bmiIndex) + ". That is considered as overweight, you should skip that burger in your hand.");
        }
    }
}
