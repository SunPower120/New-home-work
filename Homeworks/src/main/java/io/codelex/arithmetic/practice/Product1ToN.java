package io.codelex.arithmetic.practice;

public class Product1ToN {

    public static void main(String[] args) {
        int inputInt = 10;
        int factorial = 1;

        for (int i = 1; i <= inputInt; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
