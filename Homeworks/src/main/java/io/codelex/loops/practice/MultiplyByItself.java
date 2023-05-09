package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {

        System.out.print("Input number to multiply : ");
        Scanner firstInput = new Scanner(System.in);
        int numberToMultiply = firstInput.nextInt();


        System.out.print("Input multiply times : ");
        Scanner secondInput = new Scanner(System.in);
        int numberTimesToMultiply = secondInput.nextInt();


        int multiplyer = numberToMultiply;


        for (int i = 0; i < numberTimesToMultiply; i++) {
            multiplyer = multiplyer * numberToMultiply;
            System.out.println(multiplyer);
        }

    }

}
