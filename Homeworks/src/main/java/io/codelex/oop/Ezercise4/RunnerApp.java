package io.codelex.oop.Ezercise4;

import java.util.Scanner;

public class RunnerApp {

    public static void main(String[] args) {
        System.out.println("Enter your marathon time in minutes: ");
        Scanner scan = new Scanner(System.in);
        int marathonTime = scan.nextInt();

        Runner runner = Runner.getFitnessLevel(marathonTime);

        switch (runner) {
            case BEGINNER -> System.out.println("The runner is a beginner");
            case INTERMEDIATE -> System.out.println("The runner is intermediate");
            case ADVANCED -> System.out.println("The runner is advanced");
        }
    }
}
