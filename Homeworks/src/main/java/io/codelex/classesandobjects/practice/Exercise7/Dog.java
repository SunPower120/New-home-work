package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private final String name;
    private final String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public String getName() {
        return name;
    }

    public String fathersName() {
        if (father != null) {
            return father;
        } else return "Unknown";
    }

    public boolean hasSameMotherAs(Dog secondDog) {
        return this.mother.equals(secondDog.getMother());
    }
}


