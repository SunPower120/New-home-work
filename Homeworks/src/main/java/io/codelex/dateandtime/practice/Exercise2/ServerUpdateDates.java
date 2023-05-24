package io.codelex.dateandtime.practice.Exercise2;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ServerUpdateDates {
    public static void main(String[] args) {

        LocalDate startDate;
        LocalDate endDate;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter server Startup date in format YYYY-MM-DD");
        String startDateString = scan.nextLine();

        System.out.println("Enter month and year in which server mus be updated  format YYYY-MM");
        String endDateString = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        startDate = LocalDate.parse(startDateString, formatter);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM");
        YearMonth yearMonth = YearMonth.parse(endDateString, formatter2);
        endDate = yearMonth.atEndOfMonth();

        calculateServerUpdateDates(startDate, endDate);
    }

    public static void calculateServerUpdateDates(LocalDate startDate, LocalDate endDate) {
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        long dayCounter = 0;

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(14)) {
            if (date.getMonth().equals(endDate.getMonth())) {
                System.out.println("Server must be updated on : " + date);
            }
        }

    }
}

