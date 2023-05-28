package io.codelex.oop.Exercise1;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of side");
        int numSides = scan.nextInt();

        if (numSides == 3) {

            System.out.println("Enter width of triangle");
            int width = scan.nextInt();
            System.out.println("Enter height of triangle");
            int height = scan.nextInt();

            Triangle triangle = new Triangle(width, height);

            triangle.getArea();
            triangle.getPerimeter();

        } else if (numSides == 4) {
            System.out.println("Enter width of rectangle");
            int width = scan.nextInt();
            System.out.println("Enter height of rectangle");
            int height = scan.nextInt();

            Rectangle rectangle = new Rectangle(width, height);

            rectangle.getArea();
            rectangle.getPerimeter();

        } else System.out.println("Wrong input");

    }
}
