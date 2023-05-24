package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePeriodTest {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first starting date in format DD/MM/YYYY");
        String firstStartDateString = scan.nextLine();
        LocalDate firstStartDate = LocalDate.parse(firstStartDateString, formatter);

        System.out.println("Enter first end date in format DD/MM/YYYY");
        String firstEndDateString = scan.nextLine();
        LocalDate firstEndDate = LocalDate.parse(firstEndDateString, formatter);
        DatePeriod firstPeriod = new DatePeriod(firstStartDate, firstEndDate);

        System.out.println("Enter second starting date in format DD/MM/YYYY");
        String secondStartDateString = scan.nextLine();
        LocalDate secondStartDate = LocalDate.parse(secondStartDateString, formatter);

        System.out.println("Enter second end date in format DD/MM/YYYY");
        String secondEndDateString = scan.nextLine();
        LocalDate secondEndDate = LocalDate.parse(secondEndDateString, formatter);
        DatePeriod secondPeriod = new DatePeriod(secondStartDate, secondEndDate);

        firstPeriod.intersection(secondPeriod);

    }
}



