package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWordIF {

    public static void main(String[] args) {
        System.out.println("Please enter valid day of week 0-6");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        if (input == 0) {
            System.out.println("Sunday");
        } else if (input == 1) {
            System.out.println("Monday");
        } else if (input == 2) {
            System.out.println("Tuesday");
        } else if (input == 3) {
            System.out.println("Wednesday");
        } else if (input == 4) {
            System.out.println("Thursday");
        } else if (input == 5) {
            System.out.println("Friday");
        } else if (input == 6) {
            System.out.println("Saturday");
        } else System.out.println("Not a valid day");
    }
}

