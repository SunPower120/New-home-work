package io.codelex.oop.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);

    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == Car.EngineType.V12) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getCarsbefore1999() {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < 1999) {
                result.add(car);
            }
        }
        return result;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = null;
        for (Car car : cars) {
            if (mostExpensive == null || car.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = car;
            }
        }
        return mostExpensive;
    }

    public Car getCheapestCar() {
        Car mostCheapest = null;
        for (Car car : cars) {
            if (mostCheapest == null || car.getPrice() < mostCheapest.getPrice()) {
                mostCheapest = car;
            }
        }
        return mostCheapest;
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturers().size() >= 3) {
                result.add(car);
            }
        }
        return result;
    }

    public boolean isCarInList(Car car) {
        for (Car car2 : cars) {
            if (car2.getName().equals(car.getName()) && car2.getModel().equalsIgnoreCase(car.getModel())) {
                return true;
            }
        }
        return false;
    }

    public List<Car> getCarsByManufacturer(String manufacturerName) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturers()) {
                if (manufacturer.getName().equals(manufacturerName)) {
                    result.add(car);
                    break;
                }
            }
        }
        return result;
    }

    public List<Car> getCarsByManufacturerYearEstablishment(int year, String operation) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            for (Manufacturer manufacturer : car.getManufacturers()) {
                boolean condition;
                switch (operation) {
                    case "<" -> condition = manufacturer.getYearOfEstablishment() < year;
                    case ">" -> condition = manufacturer.getYearOfEstablishment() > year;
                    case "<=" -> condition = manufacturer.getYearOfEstablishment() <= year;
                    case ">=" -> condition = manufacturer.getYearOfEstablishment() >= year;
                    case "=" -> condition = manufacturer.getYearOfEstablishment() == year;
                    case "!=" -> condition = manufacturer.getYearOfEstablishment() != year;
                    default -> {
                        continue;
                    }
                }
                if (condition) {
                    result.add(car);
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }
}