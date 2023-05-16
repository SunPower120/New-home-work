package io.codelex.classesandobjects.practice;

public class BankAccount {
    public String name;
    public double balance;

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.25);
        System.out.println(benben);

        BankAccount negativeBalance = new BankAccount("Benson", -17.5);
        System.out.println(negativeBalance);
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        String formattedBalance = String.format("%.2f", balance);
        return name + ", $ " + formattedBalance;
    }

}
