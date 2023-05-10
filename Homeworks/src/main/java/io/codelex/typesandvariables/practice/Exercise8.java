package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time in minutes");
        String input = scanner.nextLine();

        double minutes = Double.parseDouble(input);
        double days = minutes / 60 /24;
        double years = days/365;

        System.out.println("Input was: \"" + input + "\" minutes and that is  " + String.format("%.4f",years) +
                " years or " + String.format("%.2f",days) + " days." );
    }
}

