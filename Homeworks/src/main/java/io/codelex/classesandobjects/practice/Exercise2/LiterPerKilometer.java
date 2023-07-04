package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class LiterPerKilometer {

    public static void main(String[] args) {

        Car mercedes = new Car(getFirstReading(), getSecondReading(), getLitersConsumed());
        printCarInformation(mercedes);

        Car volvo = new Car(getFirstReading(), getSecondReading(), getLitersConsumed());
        printCarInformation(volvo);

        Car lada = new Car(getFirstReading());

        lada.fillUp(getSecondReading(), getLitersConsumed());
        printCarInformation(lada);
        lada.setStartKilometers(lada.getEndKilometers());

        lada.fillUp(getSecondReading(), getLitersConsumed());
        printCarInformation(lada);
        lada.setStartKilometers(lada.getEndKilometers());
    }

    private static double getFirstReading() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first reading: ");
        return scan.nextDouble();
    }

    private static double getSecondReading() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter second reading: ");
        return scan.nextDouble();
    }

    private static double getLitersConsumed() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter liters consumed: ");
        return scan.nextDouble();
    }

    private static void printCarInformation(Car car) {
        System.out.println("Your car consumes " + car.calculateConsumption() + " liters per 100 km.");

        if (car.gasHog()) {
            System.out.println("Your car is a GAS HOG!!!!!!");
        } else if (car.economyCar()) {
            System.out.println("You are saving the planet.");
        } else {
            System.out.println("Your car is neither economic nor a gas hog.");
        }
    }
}

