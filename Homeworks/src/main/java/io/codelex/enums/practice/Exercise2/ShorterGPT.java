package io.codelex.enums.practice.Exercise2;

import java.util.Scanner;

public class ShorterGPT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            String inputPattern = getUserInput(scan);
            if (inputPattern.equals("q")) break;

            StonePaperScissors randomChoice = StonePaperScissors.randomPattern();
            StonePaperScissors userChoice = StonePaperScissors.userPattern(inputPattern);

            if (userChoice == null) {
                System.out.println("Wrong input");
                continue;
            }

            String result = getResult(randomChoice, userChoice);
            System.out.println(result);
        }

        System.out.println("Thanks for playing");
    }

    private static String getUserInput(Scanner scan) {
        System.out.println("(Enter s for scissor, p for paper, t for stone, q to quit):");
        return scan.nextLine();
    }

    private static String getResult(StonePaperScissors randomChoice, StonePaperScissors userChoice) {
        String randomChoiceName = randomChoice.name();
        String userChoiceName = userChoice.name();

        if (userChoice.getIsStrongerThan().equals(randomChoiceName)) {
            return getResultString(randomChoice, randomChoice.getFunction(), userChoice, "I won");
        } else if (randomChoice.getIsStrongerThan().equals(userChoiceName)) {
            return getResultString(userChoice, userChoice.getFunction(), randomChoice, "You won");
        } else {
            return "Tie";
        }
    }

    private static String getResultString(StonePaperScissors choice1, String function1, StonePaperScissors choice2,
                                          String result) {
        return choice1 + " " + function1 + " " + choice2 + " " + result;
    }
}
