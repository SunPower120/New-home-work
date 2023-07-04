package io.codelex.classesandobjects.practice.Exercise2;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    void fillUp(double mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return liters / (endKilometers - startKilometers) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }
}
