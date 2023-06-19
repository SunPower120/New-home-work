package io.codelex.Trivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriviaGame {

    private static final int QUESTIONS_COUNT = 20;
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        String newGame;
        do {
            ArrayList<Question> questions = generateQuestions();
            playGame(questions);
            System.out.print("Want more trivia? (Y/N): \n");
            newGame = scanner.nextLine();
        } while (newGame.equalsIgnoreCase("Y"));
        scanner.close();
    }

    private static ArrayList<Question> generateQuestions() throws Exception {
        ArrayList<Question> questions = new ArrayList<>();

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            Question question = GetTrivia.get();
            while (questions.contains(question)) {
                question = GetTrivia.get();
            }
            questions.add(question);
        }
        return questions;
    }

    private static void playGame(ArrayList<Question> questions) {
        String answer;
        int index = 0;
        int corrCounter = 0;

        while (index < questions.size()) {
            int current = index + 1;
            System.out.println("Question: " + current + "/" + QUESTIONS_COUNT);
            System.out.println("What " + questions.get(index).getQuestion() + "\n");
            int random1;
            int random2;
            do {
                random1 = (int) (Math.random() * QUESTIONS_COUNT);
            } while (random1 == index);
            do {
                random2 = (int) (Math.random() * QUESTIONS_COUNT);
            } while (random2 == index || random2 == random1);

            ArrayList<Integer> randomList = new ArrayList<>();
            randomList.add(index);
            randomList.add(random1);
            randomList.add(random2);

            Collections.shuffle(randomList);

            System.out.println("Answer options: ");
            for (int value : randomList) {
                System.out.println(questions.get(value).getAnswer());
            }
//           by unlocking this you are able to print answers for debug purpose
//            System.out.println("Answer: " + questions.get(index).getAnswer());

            System.out.println("Enter your answer: ");
            answer = scanner.nextLine();

            if (answer.equals(questions.get(index).getAnswer())) {
                System.out.println("You are correct!\n");
                corrCounter++;
            } else {
                System.out.println("You are wrong!\nCorrect answer was: " + questions.get(index).getAnswer());
                System.out.println("Game Over! " + corrCounter + "\\" + QUESTIONS_COUNT + " questions was answered correctly");
                break;
            }
            index++;
            if (index == questions.size()) {
                if (corrCounter == index) {
                    System.out.println("You Won!! all " + corrCounter + "\\" + QUESTIONS_COUNT + " questions was answered correctly");
                }

            }

        }
    }
}
