package io.codelex.Trivia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetTrivia {
    private static final String API_URL = "http://numbersapi.com/random/trivia";

    public static Question get() throws Exception {
        URL obj = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();
        return separateAnswerAndQuestion(content.toString());
    }

    static Question separateAnswerAndQuestion(String input) {
        String[] parts = input.split(" ", 2);
        if (parts.length >= 2) {
            String answer = parts[0];
            String question = parts[1];
            return new Question(answer, question);
        }
        return null;
    }
}


