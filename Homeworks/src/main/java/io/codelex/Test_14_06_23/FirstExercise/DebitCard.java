package io.codelex.Test_14_06_23.FirstExercise;

import java.math.BigDecimal;

public class DebitCard extends BankCard {

    public DebitCard(int number, String owner, int cvv, BigDecimal balance) {
        super(number, owner, cvv, balance);
    }

    @Override
    public void addBalance(BigDecimal add) {
        BigDecimal newBalance = super.getBalance().add(add);
        super.setBalance(newBalance);

        if (newBalance.compareTo(new BigDecimal("10000")) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}


