package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    void speedUp();

    void slowDown();

    void startEngine();

    default String showCurrentSpeed() {
        return "Unknown speed";
    }
}


