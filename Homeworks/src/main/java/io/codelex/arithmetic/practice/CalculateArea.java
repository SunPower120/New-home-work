package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choice;

    do {
        System.out.println("Geometry calculator:\n");
        System.out.println("1: Calculate the Area of a Circle");
        System.out.println("2: Calculate the Area of a Rectangle");
        System.out.println("3: Calculate the Area of a Triangle");
        System.out.println("4: Quit\n");
        System.out.println("Enter your choice (1-4):");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Input radius of circle in meters");
            double radius = scanner.nextDouble();
            double area = radius * radius * Math.PI;
            System.out.println("The radius of the circle is " + radius + " meters, and the area of the circle is " + String.format("%.2f", area) + " square meters.");
        } else if (choice == 2) {
            System.out.println("Input length of rectangle in meters");
            double length = scanner.nextDouble();
            System.out.println("Input width of rectangle in meters");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.println("The length of the rectangle is " + length + " meters, the width is " + width + " meters, and the area of the rectangle is " + area + " square meters.");
        } else if (choice == 3) {
            System.out.println("Input base length of triangle in meters");
            double baseLength = scanner.nextDouble();
            System.out.println("Input height of triangle in meters");
            double height = scanner.nextDouble();
            double area = baseLength * height * 0.5;
            System.out.println("The base length of the triangle is " + baseLength + " meters, the height is " + height + " meters, and the area of the triangle is " + area + " square meters.");
        } else if (choice == 4) {
            System.out.println("Thanks for calculating!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        System.out.println();

    } while (choice != 4);
}
}

//    public static int getMenu() {
//
//        int userChoice;
//
//        // keyboard input
//        Scanner keyboard = new Scanner(System.in);
//
//        // Display the menu.
//        System.out.println("Geometry Calculator\n");
//        System.out.println("1. Calculate the Area of a Circle");
//        System.out.println("2. Calculate the Area of a Rectangle");
//        System.out.println("3. Calculate the Area of a Triangle");
//        System.out.println("4. Quit\n");
//        System.out.print("Enter your choice (1-4) : ");
//
//        // get input from user
//        userChoice = keyboard.nextInt();
//
//        // validate input
//        while (userChoice < 1 || userChoice > 4) {
//            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
//            userChoice = keyboard.nextInt();
//        }
//
//        return userChoice;
//    }
//
//    public static void calculateCircleArea() {
//
//        BigDecimal radius = ZERO;
//
//        // Get input from user
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("What is the circle's radius? ");
//        //todo
//        //radius = keyboard.nextDouble();
//
//
//        // Display output
//        System.out.println("The circle's area is "
//                + Geometry.areaOfCircle(radius));
//    }
//
//    public static void calculateRectangleArea() {
//        BigDecimal length = ZERO;
//        BigDecimal width = ZERO;
//
//        // Get input from user
//        Scanner keyboard = new Scanner(System.in);
//
//        // Get length
//        System.out.print("Enter length? ");
//        //todo
//        //length = keyboard.nextDouble();
//
//        // Get width
//        System.out.print("Enter width? ");
//        //todo
//        //width = keyboard.nextDouble();
//
//        // Display output
//        System.out.println("The rectangle's area is "
//                + Geometry.areaOfRectangle(length, width));
//    }
//
//    public static void calculateTriangleArea() {
//        BigDecimal base = ZERO;
//        BigDecimal height = ZERO;
//
//        // Get input from user
//        Scanner keyboard = new Scanner(System.in);
//
//        // Get the base
//        System.out.print("Enter length of the triangle's base? ");
//        //todo
//        //base = keyboard.nextDouble();
//
//        // Get the height
//        System.out.print("Enter triangle's height? ");
//        //todo
//        //height = keyboard.nextDouble();
//
//        // Display the triangle's area.
//        System.out.println("The triangle's area is "
//                + Geometry.areaOfTriangle(base, height));
//    }

