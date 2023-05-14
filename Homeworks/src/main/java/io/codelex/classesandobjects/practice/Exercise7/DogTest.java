package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog dogMax = new Dog("Max", "male");
        Dog dogRocky = new Dog("Rocky", "male");
        Dog dogSparky = new Dog("Sparky", "male");
        Dog dogBuster = new Dog("Buster", "male");
        Dog dogLady = new Dog("Lady", "female");
        Dog dogMolly = new Dog("Molly", "female");
        Dog dogCoco = new Dog("Coco", "female");

        dogMax.setMother(dogLady.getName());
        dogMax.setFather(dogRocky.getName());


        dogCoco.setMother(dogMolly.getName());
        dogCoco.setFather(dogBuster.getName());

        dogBuster.setMother(dogLady.getName());
        dogBuster.setFather(dogSparky.getName());

        System.out.println(dogCoco.fathersName());
        System.out.println(dogSparky.fathersName());

        System.out.println(dogCoco.hasSameMotherAs(dogRocky));

        dogRocky.setMother(dogMolly.getName());

        System.out.println(dogCoco.hasSameMotherAs(dogRocky));

    }
}
