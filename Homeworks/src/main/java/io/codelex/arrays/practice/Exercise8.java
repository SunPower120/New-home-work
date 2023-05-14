package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise8 {
    static String[] words = {"apple", "banana", "cherry", "watermelon", "chair",
            "hippopotamus", "mountain", "plane", "iceberg", "car"};
    static int randomIndex;
    static String randomWord;
    static char[] dashes;
    static StringBuilder misses;
    static int roundCounter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            playGame();
            System.out.print("Play \"again\" or \"quit\"?: ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("again"));
    }

    public static void playGame() {
        randomIndex = (int) (Math.random() * words.length);
        randomWord = words[randomIndex];
        dashes = new char[randomWord.length()];
        misses = new StringBuilder();
        roundCounter = 0;

        System.out.println(randomWord);

        for (int i = 0; i < randomWord.length(); i++) {
            dashes[i] = '_';
        }
        while (!isGameWon() && !isGameLost()) {
            gameUi();
            roundCounter++;
        }
        if (isGameWon()) {
            System.out.println("Congratulations! You won.");
        } else if (isGameLost()) {
            System.out.println("You lost. The word was: " + randomWord);
        }
    }

    public static void guessLetter(String randomWord, char[] dashes, StringBuilder misses) {
        char[] randomWordArray = randomWord.toCharArray();
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess: ");
        char inputChar = scan.next().charAt(0);

        boolean isCorrectGuess = false;
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWordArray[i] == inputChar) {
                dashes[i] = inputChar;
                isCorrectGuess = true;
            }
        }
        if (!isCorrectGuess) {
            misses.append(inputChar);
        }
    }

    public static void gameUi() {
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.print("Word:\t");
        for (char dash : dashes) {
            System.out.print(dash);
        }
        System.out.println("\n");
        System.out.println("Misses:\t" + misses + "\n");

        guessLetter(randomWord, dashes, misses);
    }

    public static boolean isGameWon() {
        String currentGuess = new String(dashes);
        return currentGuess.equals(randomWord);
    }

    public static boolean isGameLost() {
        return roundCounter > randomWord.length() * 2; // For example, a player loses after 7 incorrect guesses.
    }
}
