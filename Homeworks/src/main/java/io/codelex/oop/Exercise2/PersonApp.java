package io.codelex.oop.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        System.out.println("Enter employee's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter employee's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter employee's ID:");
        String id = scanner.nextLine();
        System.out.println("Enter employee's age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee's position:");
        String position = scanner.nextLine();
        System.out.println("Enter employee's start date (format: dd/mm/yyyy):");
        LocalDate startDate = LocalDate.parse(scanner.nextLine(), formatter);

        Employee employee = new Employee(firstName, lastName, id, age, position, startDate);
        System.out.println(employee.getInfo());

        System.out.println("Enter customer's first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter customer's last name:");
        lastName = scanner.nextLine();
        System.out.println("Enter customer's ID:");
        id = scanner.nextLine();
        System.out.println("Enter customer's age:");
        age = scanner.nextInt();
        System.out.println("Enter customer's purchase count:");
        int purchaseCount = scanner.nextInt();

        Customer customer = new Customer(firstName, lastName, id, age, purchaseCount);
        System.out.println(customer.getInfo());

        scanner.close();
    }
}