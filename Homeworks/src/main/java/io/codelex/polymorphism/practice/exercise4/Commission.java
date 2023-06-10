package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commission;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        this.commission = commission;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double payment = super.pay() + totalSales * commission;
        totalSales = 0;
        return payment;
    }
}
