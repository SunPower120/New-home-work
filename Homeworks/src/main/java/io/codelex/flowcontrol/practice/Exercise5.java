package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Please enter valid string using only uppercase or lowercase symbols");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        char[] charArray = input.toCharArray();
        String output = "";

        for (int i = 0; i < charArray.length; ) {
            if (charArray[i] == 'a' || charArray[i] == 'b' || charArray[i] == 'c') {
                output = output.concat("2");
                i++;
            } else if (charArray[i] == 'd' || charArray[i] == 'e' || charArray[i] == 'f') {
                output = output.concat("3");
                i++;
            } else if (charArray[i] == 'g' || charArray[i] == 'h' || charArray[i] == 'i') {
                output = output.concat("4");
                i++;
            } else if (charArray[i] == 'j' || charArray[i] == 'k' || charArray[i] == 'l') {
                output = output.concat("5");
                i++;
            } else if (charArray[i] == 'm' || charArray[i] == 'n' || charArray[i] == 'o') {
                output = output.concat("6");
                i++;
            } else if (charArray[i] == 'p' || charArray[i] == 'q' || charArray[i] == 'r' || charArray[i] == 's') {
                output = output.concat("7");
                i++;
            } else if (charArray[i] == 't' || charArray[i] == 'u' || charArray[i] == 'v') {
                output = output.concat("8");
                i++;
            } else if (charArray[i] == 'w' || charArray[i] == 'x' || charArray[i] == 'y' || charArray[i] == 'z') {
                output = output.concat("9");
                i++;
            } else {
                System.out.println("String contains unrecognisable symbols");
                return;
            }
        }
        System.out.println(output);
    }
}

