package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    String sex;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.sex = breed;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.eat(food);
        } else {
            System.out.println("Tiger are not eating that type of food!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
