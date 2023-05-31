package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        Map<Integer, Integer> frequency = new TreeMap<>();

        String[] scoresArray = scores.split(" ");
        ArrayList<Integer> scoresList = new ArrayList<>();

        for (String score : scoresArray) {
            scoresList.add(Integer.parseInt(score));
        }

        for (Integer score : scoresList) {
            int val = score / 10;
            frequency.put(val, frequency.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            printFormatted(entry.getKey());
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printFormatted(int key) {
        int lowerRange = key * 10;
        int upperRange = (key * 10) + 9;

        System.out.printf(lowerRange + "-" + upperRange + ": ");
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
