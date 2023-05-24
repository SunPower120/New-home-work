package io.codelex.dateandtime.practice.Exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        LocalDate startDate;
        LocalDate endDate;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting date in format DD/MM/YYYY");
        String startDateString = scan.nextLine();

        System.out.println("Enter end date in format DD/MM/YYYY");
        String endDateString = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        startDate = LocalDate.parse(startDateString, formatter);
        endDate = LocalDate.parse(endDateString, formatter);

        System.out.println("In total person has worked : " + calculateWorkingHours(startDate, endDate) + " hours");
    }

    public static long calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate) + 1;
        long weekends = 0;

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == java.time.DayOfWeek.SATURDAY || date.getDayOfWeek() == java.time.DayOfWeek.SUNDAY) {
                weekends++;
            }
        }

        long workingDays = totalDays - weekends;
        return workingDays * 8;
    }
}

