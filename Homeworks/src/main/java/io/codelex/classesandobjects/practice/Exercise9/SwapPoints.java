package io.codelex.classesandobjects.practice.Exercise9;

import java.util.Scanner;

public class SwapPoints {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Point p1 (x y): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Point p2 (x y): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int[] point1 = {x1, y1};
        int[] point2 = {x2, y2};

        int[] pointExchange = point1;
        point1 = point2;
        point2 = pointExchange;

        System.out.println("Swapped Points:");
        System.out.println("(" + point1[0] + ", " + point1[1] + ")");
        System.out.println("(" + point2[0] + ", " + point2[1] + ")");
    }
}
