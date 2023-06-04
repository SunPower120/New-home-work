package io.codelex.classesandobjects.practice.Exercise5;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date newDate = new Date(setMonth(), setDay(), setYear());
        newDate.displayDate();

        newDate.setDate(setDay());
        newDate.displayDate();

        newDate.setMonth(setMonth());
        newDate.displayDate();

        newDate.setYear(setYear());
        newDate.displayDate();
    }

    private static int setDay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day of month: ");
        return scan.nextInt();
    }

    private static int setMonth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month: ");
        return scan.nextInt();
    }

    private static int setYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year: ");
        return scan.nextInt();
    }
}
