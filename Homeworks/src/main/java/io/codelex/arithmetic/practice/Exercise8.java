package io.codelex.arithmetic.practice;

public class Exercise8 {
    private static double MinimumWage = 8.00;
    private static int MaxHours = 60;
    private static int StandartHours = 40;
    private static double OvertimeRate = 1.5;

    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < MinimumWage) {
            System.out.println("Error: Base pay is below the minimum wage.");
            return;
        }

        if (hoursWorked > MaxHours) {
            System.out.println("Error: Hours worked exceed the maximum allowed hours.");
            return;
        }

        double totalPay;
        if (hoursWorked <= StandartHours) {
            totalPay = basePay * hoursWorked;
        } else {
            int regularHours = StandartHours;
            int overtimeHours = hoursWorked - StandartHours;

            totalPay = basePay * regularHours + basePay * OvertimeRate * overtimeHours;
        }

        System.out.println("Total pay: $" + String.format("%.2f",totalPay));
    }

    public static void main(String[] args) {
        // Calculate pay for each employee
        calculatePay(7.50, 35);  // Employee 1
        calculatePay(8.20, 47);  // Employee 2
        calculatePay(10.00, 73); // Employee 3
    }
}

