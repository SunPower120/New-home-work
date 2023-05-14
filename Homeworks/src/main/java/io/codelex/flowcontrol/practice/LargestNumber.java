package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = {-2147483648, -2147483648, -2147483648};

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();
        numbers[0] = num1;

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();
        numbers[1] = num2;

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
        numbers[2] = num3;

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
    }

}
