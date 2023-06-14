package io.codelex.Test_14_06_23.FirstExercise;

import java.math.BigDecimal;

public class CreditCard extends BankCard {

    public CreditCard(int number, String owner, int cvv, BigDecimal balance) {
        super(number, owner, cvv, balance);
    }

    @Override
    public void removeBalance(BigDecimal remove) {
        BigDecimal newBalance = super.getBalance().subtract(remove);
        super.setBalance(newBalance);

        if (newBalance.compareTo(new BigDecimal("100")) < 0) {
            System.out.println("Warning: Low funds");
        }
        if (newBalance.compareTo(remove) < 0) {
            throw new NotEnoughFundsException("Insufficient balance on the card!");
        }
    }
}


