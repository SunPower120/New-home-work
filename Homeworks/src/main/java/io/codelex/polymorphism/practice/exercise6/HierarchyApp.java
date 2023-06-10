package io.codelex.polymorphism.practice.exercise6;

import java.util.Scanner;

public class HierarchyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data like this: Animal Name Weight Region press Enter\nInput Foodtype Amount");
        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            String[] animalData = input.split("\\s+");
            String[] foodData = scanner.nextLine().split("\\s+");

            Animal animal = createAnimal(animalData);
            Food food = createFood(foodData);

            animal.makeSound();
            animal.eat(food);

            System.out.println(animal);
        }
    }

    public static Animal createAnimal(String[] animalData) {
        Animal animal = null;

        String animalType = animalData[0];
        String animalName = animalData[1];
        Double animalWeight = Double.parseDouble(animalData[2]);
        String livingRegion = animalData[3];


        switch (animalType) {
            case "Mouse" -> animal = new Mouse(animalName, animalType, animalWeight, livingRegion);
            case "Zebra" -> animal = new Zebra(animalName, animalType, animalWeight, livingRegion);
            case "Cat" -> {
                String breedOrSex = animalData[4];
                animal = new Cat(animalName, animalType, animalWeight, livingRegion, breedOrSex);
            }
            case "Tiger" -> {
                String breedOrSex = animalData[4];
                animal = new Tiger(animalName, animalType, animalWeight, livingRegion, breedOrSex);
            }

        }
        return animal;
    }

    public static Food createFood(String[] foodData) {
        Food food = null;

        String foodType = foodData[0];
        int quantity = Integer.parseInt(foodData[1]);

        switch (foodType) {
            case "Vegetable" -> food = new Vegetable(quantity);
            case "Meat" -> food = new Meat(quantity);
        }
        return food;
    }
}
