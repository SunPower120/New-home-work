package io.codelex.oop.Exercise2;

public abstract class Person {
    protected final String firstName;
    protected final String lastName;
    protected final String iD;
    protected int age;

    public Person(String firstName, String lastName, String iD, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iD = iD;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getiD() {
        return iD;
    }

    public int getAge() {
        return age;
    }

    public abstract String getInfo();
}
