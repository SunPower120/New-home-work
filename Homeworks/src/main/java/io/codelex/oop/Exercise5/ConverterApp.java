package io.codelex.oop.Exercise5;

import java.util.Scanner;

public class ConverterApp {
    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("""
                Chose your converter by entering number
                1: for converting Meters to Yards
                2: for converting Yards to Meters
                3: for converting Centimeter to Inches
                4: for converting Inches to Centimeters
                5: for converting Kilometers to Miles
                6: for converting Miles to Kilometers
                """);
        int conversionTypeInput = scan.nextInt();

        ConversionType conversionType = ConversionType.values()[conversionTypeInput - 1];

        System.out.println("Enter convertable integer: ");

        int convertableInteger = scan.nextInt();

        MeasurementConverter measurementConverter = new MeasurementConverter();

        System.out.println(measurementConverter.getResult(convertableInteger, conversionType));
    }
}
