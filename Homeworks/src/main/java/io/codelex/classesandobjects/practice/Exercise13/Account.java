package io.codelex.classesandobjects.practice.Exercise13;

public class Account {
    private double balance;
    private final String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }


    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
