package io.codelex.oop.Exercise2;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private final String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String iD, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, iD, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int howLongHasBeenWorking() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(startedWorking, currentDate).getYears();
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + position + " " + howLongHasBeenWorking();
    }
}
