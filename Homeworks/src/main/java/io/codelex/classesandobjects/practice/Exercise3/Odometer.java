package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {

    private double mileage;
    private final FuelGauge fuelGauge;

    public Odometer(double mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    public double getMileage() {
        return mileage;
    }

    public double setMileage(double mileage) {
        if (mileage <= 999999 && mileage >= 0) {
            return this.mileage = mileage;
        } else System.out.println("Your set mileage is out of bounds");
        return mileage;
    }

    public void incrementMileage() {
        mileage += 1;
        if (mileage % 10 == 0) {
            fuelGauge.reduce();
        }
    }
}
