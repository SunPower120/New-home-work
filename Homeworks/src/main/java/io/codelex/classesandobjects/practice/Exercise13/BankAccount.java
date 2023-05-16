package io.codelex.classesandobjects.practice.Exercise13;

public class BankAccount {
    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        matt.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(matt + "\n" + myAccount);

        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);

        Account.transfer(A, B, 50);
        Account.transfer(B, C, 25);

        System.out.println(A + "\n" + B + "\n" + C);

    }


}
