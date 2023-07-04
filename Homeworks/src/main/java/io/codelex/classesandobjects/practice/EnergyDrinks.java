package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int numberedSurveyed = 12467;
    static final double purchasedEnergyDrinks = 0.14;
    static final double preferCitrusDrinks = 0.64;

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + numberedSurveyed);
        System.out.println("Approximately " + calculateEnergyDrinkers() + " bought at least one energy drink");
        System.out.println(calculatePreferCitrus() + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers() {
        return numberedSurveyed * purchasedEnergyDrinks;
    }

    public static double calculatePreferCitrus() {
        return calculateEnergyDrinkers() * preferCitrusDrinks;

    }
}
