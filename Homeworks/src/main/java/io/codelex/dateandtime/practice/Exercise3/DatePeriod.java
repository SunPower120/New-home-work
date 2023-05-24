package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate startDate;
    LocalDate endDate;

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void intersection(DatePeriod secondPeriod) {

        if (getStartDate().isAfter(secondPeriod.startDate) && getEndDate().isAfter(secondPeriod.endDate) && getStartDate().isBefore(secondPeriod.endDate)) {
            System.out.println("Overlap variable should have start date " + getStartDate() + " and end date " + secondPeriod.endDate);
        } else if (getStartDate().isBefore(secondPeriod.startDate) && getEndDate().isBefore(secondPeriod.endDate) && getEndDate().isAfter(secondPeriod.startDate)) {
            System.out.println("Overlap variable should have start date " + secondPeriod.startDate + " and end date " + getEndDate());
        } else if (getStartDate().isBefore(secondPeriod.startDate) && getEndDate().isAfter(secondPeriod.endDate)) {
            System.out.println("Overlap variable should have start date " + secondPeriod.startDate + " and end date " + secondPeriod.endDate);
        } else if (getStartDate().isAfter(secondPeriod.startDate) && getEndDate().isBefore(secondPeriod.endDate)) {
            System.out.println("Overlap variable should have start date " + getStartDate() + " and end date " + getEndDate());
        } else System.out.println("periods do not overlap");


    }

}
