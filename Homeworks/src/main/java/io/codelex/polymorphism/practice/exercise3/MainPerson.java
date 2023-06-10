package io.codelex.polymorphism.practice.exercise3;

public class MainPerson {
    public static void main(String[] args) {
        Student student = new Student("John", "Dere", "Local Adress", 3245, 15800);
        Employee employee = new Employee("Victory", "Statue", "Somwhere in NY", 4755, "Statue");

        employee.display();
        System.out.println("\n");
        student.display();

    }
}
