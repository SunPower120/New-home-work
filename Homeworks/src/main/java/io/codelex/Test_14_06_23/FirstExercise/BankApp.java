package io.codelex.Test_14_06_23.FirstExercise;

import java.math.BigDecimal;

public class BankApp {

    public static void main(String[] args) {

        BankCard creditCard = new CreditCard(123456789, "Andris Andris", 123, new BigDecimal("5000"));
        creditCard.removeBalance(new BigDecimal("4950"));
        System.out.println("Credit Card Balance: " + creditCard.getBalance());

        BankCard debitCard = new DebitCard(987654321, "Zane Zane", 456, new BigDecimal("5000"));
        debitCard.addBalance(new BigDecimal("6000"));
        System.out.println("Debit Card Balance: " + debitCard.getBalance());

        BankCard debitCard2 = new DebitCard(987654321, "Jana Jana", 456, new BigDecimal("5000"));
        debitCard.removeBalance(new BigDecimal("6000"));
        System.out.println("Debit Card Balance: " + debitCard2.getBalance());
    }
}
