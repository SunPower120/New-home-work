package io.codelex.dateandtime.practice.Exercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Chat GPT alternatīva.
public class WorkingHours2 {
    public static void main(String[] args) {
        Calendar startDate;
        Calendar endDate;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting date in format DD/MM/YYYY");
        String startDateString = scan.nextLine();

        System.out.println("Enter end date in format DD/MM/YYYY");
        String endDateString = scan.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        startDate = parseCalendarDate(startDateString, dateFormat);
        endDate = parseCalendarDate(endDateString, dateFormat);

        System.out.println("In total person has worked : " + calculateWorkingHours(startDate, endDate) + " hours");
    }

    public static Calendar parseCalendarDate(String dateString, SimpleDateFormat dateFormat) {
        Calendar calendar = Calendar.getInstance();
        try {
            Date date = dateFormat.parse(dateString);
            calendar.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }

    public static long calculateWorkingHours(Calendar startDate, Calendar endDate) {
        long totalDays = calculateDaysBetween(startDate, endDate) + 1;
        long weekends = 0;

        for (Calendar date = (Calendar) startDate.clone(); !date.after(endDate); date.add(Calendar.DAY_OF_MONTH, 1)) {
            int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                weekends++;
            }
        }

        long workingDays = totalDays - weekends;
        return workingDays * 8;
    }

    public static long calculateDaysBetween(Calendar startDate, Calendar endDate) {
        long startTime = startDate.getTimeInMillis();
        long endTime = endDate.getTimeInMillis();
        long diffTime = endTime - startTime;
        return diffTime / (24 * 60 * 60 * 1000);
    }
}
