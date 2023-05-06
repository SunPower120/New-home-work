package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String Name;
        String Eyes;
        String Teeth;
        String Hair;
        double Age;
        double Height;
        double Weight;
        double HeightInCm;
        double WeightInKg;
        double SumOffHeWeAge;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74;  // inches
        Weight = 180; // lbs
        HeightInCm = Height * 2.54;
        WeightInKg = Weight * 0.453592;
        SumOffHeWeAge = Age + HeightInCm + WeightInKg;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + String.format("%.2f", HeightInCm) + " cm tall.");
        System.out.println("He's " + String.format("%.2f", WeightInKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes.toLowerCase() + " eyes and " + Hair.toLowerCase() + " hair.");
        System.out.println("His teeth are usually " + Teeth.toLowerCase() + " if he dont drink too much coffee.");

        System.out.println("If I add " + String.format("%.2f", Age) + ", " + String.format("%.2f", HeightInCm) + ", and " + String.format("%.2f", WeightInKg)
                + " I get " + String.format("%.2f", SumOffHeWeAge) + ".");
    }
}