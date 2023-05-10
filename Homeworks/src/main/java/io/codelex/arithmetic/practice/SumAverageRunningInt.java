package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 100;

        average = ((double)lowerBound + (double)upperBound)/2;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        System.out.println("The sum of "+ lowerBound + " to " + upperBound + " is " + sum);
        System.out.println("The average is " + average);
    }

}
