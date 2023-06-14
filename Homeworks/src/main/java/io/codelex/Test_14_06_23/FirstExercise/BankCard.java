package io.codelex.Test_14_06_23.FirstExercise;

import java.math.BigDecimal;

public abstract class BankCard {
    private int number;
    private String owner;
    private int cvv;
    private BigDecimal balance;

    public BankCard(int number, String owner, int cvv, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        this.cvv = cvv;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


    public void addBalance(BigDecimal add) {
        balance = balance.add(add);
    }

    public void removeBalance(BigDecimal remove) {
        balance = balance.subtract(remove);
    }
}
