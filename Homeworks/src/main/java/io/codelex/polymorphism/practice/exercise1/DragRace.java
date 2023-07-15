package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Tesla tesla = new Tesla();
        Supra supra = new Supra();
        ZazElectric zazElectric = new ZazElectric();

        ArrayList<Car> carList = new ArrayList<>();

        carList.add(audi);
        carList.add(bmw);
        carList.add(lexus);
        carList.add(tesla);
        carList.add(supra);
        carList.add(zazElectric);

        for (Car car : carList) {
            for (int i = 0; i < 10; i++) {
                if (i == 3 && car instanceof CarWithNitro) {
                    ((CarWithNitro) car).useNitrousOxideEngine();
                } else {
                    car.speedUp();
                }

            }
        }
        carList.forEach(car -> System.out.println("Drag race result: " + car.getClass().getSimpleName() + " " + car.showCurrentSpeed() + " km/h "));
        carList.stream()
                .max(Comparator.comparing(Car::showCurrentSpeed))
                .ifPresent(fastestCar -> System.out.println("Fastest car: " + fastestCar.getClass().getSimpleName() + " with speed: " + fastestCar.showCurrentSpeed()));
    }
}
