package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {
    private double currenAmount;

    public FuelGauge(double currenAmount) {
        this.currenAmount = currenAmount;
    }

    public double getCurrenAmount() {
        return currenAmount;
    }

    public double setCurrentAmount(double currenAmount) {
        if (currenAmount <= 70 && currenAmount >= 0) {
            return this.currenAmount = currenAmount;
        } else System.out.println("Your fill is out of bounds 0-70");
        return currenAmount;
    }

    public double fillUppOneLiter() {

        if (currenAmount <= 70) {
            currenAmount = currenAmount + 1;
            return currenAmount;
        } else {
            System.out.println("Your car has full tank");
        }

        return currenAmount;
    }

    public void reduce() {
        if (currenAmount >= 1) {
            currenAmount -= 1;
        } else {
            System.out.println("You are out of gas");
        }
    }
}
