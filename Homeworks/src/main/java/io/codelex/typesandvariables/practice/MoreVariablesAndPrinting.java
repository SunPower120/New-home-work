package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name = "Zed A. Shaw";
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";
        double age = 35;
        double height = 74;  // inches
        double weight = 180; // lbs
        double heightInCm = height * 2.54;
        double weightInKg = weight * 0.453592;
        double sumOffHeWeAge = age + heightInCm + weightInKg;

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", heightInCm) + " cm tall.");
        System.out.println("He's " + String.format("%.2f", weightInKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes.toLowerCase() + " eyes and " + hair.toLowerCase() + " hair.");
        System.out.println("His teeth are usually " + teeth.toLowerCase() + " if he dont drink too much coffee.");
        System.out.println("If I add " + String.format("%.2f", age) + ", " + String.format("%.2f", heightInCm) + ", and " + String.format("%.2f", weightInKg)
                + " I get " + String.format("%.2f", sumOffHeWeAge) + ".");
    }
}