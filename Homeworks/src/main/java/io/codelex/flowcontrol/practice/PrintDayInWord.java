package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {

    public static void main(String[] args) {
        System.out.println("Please enter valid day of week 0-6");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch (input) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Not a valid day");
        }
    }
}
