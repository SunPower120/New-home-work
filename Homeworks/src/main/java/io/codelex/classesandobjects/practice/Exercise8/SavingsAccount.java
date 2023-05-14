package io.codelex.classesandobjects.practice.Exercise8;

public class SavingsAccount {
    private double balance;
    private double interest;

    public SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void withdraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
    }

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public void addInterest() {
        balance = balance + balance * interest / 12 / 100;
    }

    public double monthlyInterestEarned() {
        return balance * interest / 12 / 100;

    }
}
