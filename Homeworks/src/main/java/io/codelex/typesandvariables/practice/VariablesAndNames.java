package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars;
        int drivers;
        int carsNotDriven;
        int seatsInCar;
        double carsDriven;
        double passengers;
        double carpoolCapacity;
        double averagePassengersPerCar;


        cars = 100;
        seatsInCar = 4;
        drivers = 30;
        passengers = 99;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * seatsInCar;
        averagePassengersPerCar = passengers / carsDriven;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + String.format("%.2f", carpoolCapacity) + " people today.");
        System.out.println("We have " + String.format("%.2f", passengers) + " passengers to carpool today.");
        System.out.println("We need to put about " + String.format("%.2f", averagePassengersPerCar) + " in each car.");

    }
}