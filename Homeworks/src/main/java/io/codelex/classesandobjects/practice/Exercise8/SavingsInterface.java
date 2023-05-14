package io.codelex.classesandobjects.practice.Exercise8;

import java.util.Scanner;

public class SavingsInterface {

    static double months;
    static double depositAccumulator;
    static double withdrawAccumulator;
    static double interestAccumulator;

    public static void main(String[] args) {


        SavingsAccount personalSavingAcc = new SavingsAccount(depositAmount(), interestRate());

        monthsAccOpen();

        for (int i = 1; i <= months; i++) {

            System.out.println("Enter amount deposited for month: " + i);
            Scanner scan = new Scanner(System.in);
            double deposit = scan.nextDouble();
            personalSavingAcc.deposit(deposit);
            depositAccumulator = depositAccumulator + deposit;


            System.out.println("Enter amount withdrawn for month: " + i);
            Scanner scan2 = new Scanner(System.in);
            double withdrawal = scan2.nextDouble();
            personalSavingAcc.withdraw(withdrawal);
            withdrawAccumulator = withdrawAccumulator + withdrawal;

            interestAccumulator = personalSavingAcc.monthlyInterestEarned();
            personalSavingAcc.addInterest();


        }

        System.out.println("Total deposited: $" + String.format("%.2f", depositAccumulator));
        System.out.println("Total withdrawn: $" + String.format("%.2f", withdrawAccumulator));
        System.out.println("Interest earned: $" + String.format("%.2f", interestAccumulator));
        System.out.println("Ending balance: $" + String.format("%.2f", personalSavingAcc.getBalance()));


    }

    public static double depositAmount() {
        System.out.println("How much money is in the account?: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static double interestRate() {
        System.out.println("Enter annual interest rate: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static void monthsAccOpen() {
        System.out.println("How long has the account been opened?");
        Scanner scan = new Scanner(System.in);
        months = scan.nextDouble();
    }
}
