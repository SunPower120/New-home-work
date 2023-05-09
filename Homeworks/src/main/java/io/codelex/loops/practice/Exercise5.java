package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        System.out.print("Enter first word : ");
        Scanner firstInput = new Scanner(System.in);
        String firstInputString = firstInput.nextLine();

        System.out.print("Enter page numbers : ");
        Scanner secondInput = new Scanner(System.in);
        String secondInputInteger = secondInput.nextLine();

        int dotCount = 30 - secondInputInteger.length() - firstInputString.length();

        String dots = "";

        for (int i = 0; i < dotCount; i++) {
            dots = dots + ".";

        }
        System.out.println(firstInputString + dots + secondInputInteger);
    }

}
