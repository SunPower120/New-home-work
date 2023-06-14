package io.codelex.Test_14_06_23.ThirdExercise;

import java.util.List;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> items) {
        if (items.isEmpty()) {
            return "";
        }

        StringBuilder joiner = new StringBuilder();
        for (T item : items) {
            joiner.append(item.toString()).append(separator);
        }

        // Remove the last separator
        joiner.setLength(joiner.length() - separator.length());

        return joiner.toString();
    }
}

