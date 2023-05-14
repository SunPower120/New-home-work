package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {


        System.out.print("Enter number of levels: ");
        Scanner input = new Scanner(System.in);
        int inputInteger = input.nextInt();


        for (int i = 0; i < inputInteger; i++) {

            for (int j = 0; j < (inputInteger - i - 1) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < i * 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (inputInteger - i - 1) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
