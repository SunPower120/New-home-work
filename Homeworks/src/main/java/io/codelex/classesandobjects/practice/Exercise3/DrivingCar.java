package io.codelex.classesandobjects.practice.Exercise3;

import java.util.Scanner;

public class DrivingCar {
    public static void main(String[] args) {

        FuelGauge firstCarsLitersInTank = new FuelGauge(setLitersInTank());
        Odometer firstCarsOdometer = new Odometer(setMileages(), firstCarsLitersInTank);

        while (firstCarsLitersInTank.getCurrenAmount() < 70) {
            firstCarsLitersInTank.fillUppOneLiter();
            System.out.println("You filled up tank " + firstCarsLitersInTank.getCurrenAmount());
        }
        while (firstCarsLitersInTank.getCurrenAmount() > 0) {
            firstCarsOdometer.incrementMileage();
            System.out.println("You have driven " + firstCarsOdometer.getMileage() + " miles and have "
                    + firstCarsLitersInTank.getCurrenAmount() + " liters in your tank");
        }

    }

    private static double setLitersInTank() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter liters in tank: ");
        return scan.nextDouble();
    }

    private static double setMileages() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter mileages on odometer: ");
        return scan.nextDouble();
    }
}
