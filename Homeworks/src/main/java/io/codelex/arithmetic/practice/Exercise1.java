package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first Integer:");
        Integer input1Integer = scanner.nextInt();

        System.out.println("Input second Integer:");
        Integer input2Integer = scanner.nextInt();

        boolean condition = input1Integer == 15 ||
                input2Integer == 15 ||
                input1Integer + input2Integer == 15 ||
                input1Integer - input2Integer == 15 ||
                input2Integer - input1Integer == 15;

        System.out.println("Your inputs resulted in: " + condition );

    }
}

