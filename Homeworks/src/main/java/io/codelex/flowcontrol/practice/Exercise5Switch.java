package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5Switch {
    public static void main(String[] args) {
        System.out.println("Please enter valid string using only uppercase or lowercase symbols");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        char[] charArray = input.toCharArray();
        String output = "";

        for (int i = 0; i < charArray.length; ) {
            switch (charArray[i]) {
                case 'a', 'b', 'c' -> {
                    output = output.concat("2");
                    i++;
                }
                case 'd', 'e', 'f' -> {
                    output = output.concat("3");
                    i++;
                }
                case 'g', 'h', 'i' -> {
                    output = output.concat("4");
                    i++;
                }
                case 'j', 'k', 'l' -> {
                    output = output.concat("5");
                    i++;
                }
                case 'm', 'n', 'o' -> {
                    output = output.concat("6");
                    i++;
                }
                case 'p', 'q', 'r', 's' -> {
                    output = output.concat("7");
                    i++;
                }
                case 't', 'u', 'v' -> {
                    output = output.concat("8");
                    i++;
                }
                case 'w', 'x', 'y', 'z' -> {
                    output = output.concat("9");
                    i++;
                }
                default -> {
                    System.out.println("String contains unrecognisable symbols");
                    return;
                }
            }
        }
        System.out.println(output);
    }
}

