package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
        } else {
            System.out.println("Cat are not eating that type of food!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Mjau maju");
    }
}
