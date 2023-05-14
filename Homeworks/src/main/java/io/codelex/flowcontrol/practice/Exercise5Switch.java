package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5Switch {
    public static void main(String[] args) {
        System.out.println("Please enter valid string using only uppercase or lowercase symbols");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        char[] charArray = input.toCharArray();
        String output = "";

        for (char c : charArray) {
            switch (c) {
                case 'a', 'b', 'c' -> output = output.concat("2");
                case 'd', 'e', 'f' -> output = output.concat("3");
                case 'g', 'h', 'i' -> output = output.concat("4");
                case 'j', 'k', 'l' -> output = output.concat("5");
                case 'm', 'n', 'o' -> output = output.concat("6");
                case 'p', 'q', 'r', 's' -> output = output.concat("7");
                case 't', 'u', 'v' -> output = output.concat("8");
                case 'w', 'x', 'y', 'z' -> output = output.concat("9");
                default -> {
                    System.out.println("String contains unrecognizable symbols");
                    return;
                }
            }
        }
        System.out.println(output);
    }
}

