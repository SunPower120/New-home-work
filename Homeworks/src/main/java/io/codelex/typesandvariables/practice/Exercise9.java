package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in meters:");
        Double inputDistance = scanner.nextDouble();

        System.out.println("Input hour:");
        Double inputHours = scanner.nextDouble();

        System.out.println("Input minutes:");
        Double inputMinutes = scanner.nextDouble();

        System.out.println("Input seconds:");
        Double inputSeconds = scanner.nextDouble();

        double TotalTimeInSeconds = inputHours*3600 + inputMinutes*60 + inputSeconds;
        double TotalTimeInHours = TotalTimeInSeconds/3600;
        double SpeedMetersPerSeconds = inputDistance/TotalTimeInSeconds;
        double DistanceInKm = inputDistance/1000;
        double DistanceInMiles = inputDistance/1609;
        double SpeedKmH = DistanceInKm/TotalTimeInHours;
        double SpeedMilesH = DistanceInMiles/TotalTimeInHours;




        System.out.println("Your speed in meters/second is " + String.format("%.2f",SpeedMetersPerSeconds) );
        System.out.println("Your speed in km/h is " + String.format("%.2f",SpeedKmH));
        System.out.println("Your speed in miles/h is " + String.format("%.2f",SpeedMilesH));
    }
}

