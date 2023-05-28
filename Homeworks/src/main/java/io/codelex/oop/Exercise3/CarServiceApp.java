package io.codelex.oop.Exercise3;

import java.util.List;
import java.util.Scanner;

public class CarServiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manufacturer manufacturer1 = new Manufacturer("Tesla", 2003, "USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1903, "USA");
        Manufacturer manufacturer3 = new Manufacturer("Toyota", 1937, "Japan");

        Car car1 = new Car("Tesla", "Model S", 79990, 2022,
                List.of(manufacturer1), Car.EngineType.S3);
        Car car2 = new Car("Ford", "Focus", 27995, 1989,
                List.of(manufacturer2), Car.EngineType.V8);
        Car car3 = new Car("Toyota", "Camry", 24970, 2021,
                List.of(manufacturer3), Car.EngineType.V6);
        Car car4 = new Car("Ford", "Mustang", 250000, 2021,
                List.of(manufacturer2), Car.EngineType.V12);

        CarService carService = new CarService();

        // Adding cars to the list
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        int option = 0;


        while (option != 9) {
            System.out.println("Car Service App");
            System.out.println("----------------");
            System.out.println("Choose an option:");
            System.out.println("1. Get cars with V12 engine");
            System.out.println("2. Get cars produced before 1999");
            System.out.println("3. Get the most expensive car");
            System.out.println("4. Get the cheapest car");
            System.out.println("5. Get cars with at least three manufacturers");
            System.out.println("6. Check if a specific car is in the list");
            System.out.println("7. Get cars manufactured by a specific manufacturer");
            System.out.println("8. Get cars manufactured by a manufacturer with establishment year comparison");
            System.out.println("9. Exit app");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> System.out.println(carService.getCarsWithV12Engine());
                case 2 -> System.out.println(carService.getCarsbefore1999());
                case 3 -> System.out.println(carService.getMostExpensiveCar());
                case 4 -> System.out.println(carService.getCheapestCar());
                case 5 -> System.out.println(carService.getCarsWithAtLeastThreeManufacturers());
                case 6 -> {
                    System.out.println("Enter the make of the car:");
                    String make = scanner.nextLine();
                    System.out.println("Enter the model of the car:");
                    String model = scanner.nextLine();

                    Car carToCheck = new Car(make, model, 0, 0, null, null);
                    System.out.println(carService.isCarInList(carToCheck));
                }
                case 7 -> {
                    System.out.println("Enter the manufacturer name:");
                    String manufacturerName = scanner.nextLine();
                    System.out.println(carService.getCarsByManufacturer(manufacturerName));
                }
                case 8 -> {
                    System.out.println("Enter the year:");
                    int year2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the comparison operator (<, >, <=, >=, =, !=):");
                    String operator = scanner.nextLine();
                    System.out.println(carService.getCarsByManufacturerYearEstablishment(year2, operator));
                }
                default -> System.out.println("Invalid option. Please choose a valid option.");
            }

        }

    }
}
