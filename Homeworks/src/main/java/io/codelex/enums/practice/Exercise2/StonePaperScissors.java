package io.codelex.enums.practice.Exercise2;

import java.util.Random;

public enum StonePaperScissors {
    STONE("SCISSORS", "breaks"),
    PAPER("STONE", "wraps"),
    SCISSORS("PAPER", "cuts");

    private final String isStrongerThan;
    private final String function;

    StonePaperScissors(String isStrongerThan, String function) {
        this.isStrongerThan = isStrongerThan;
        this.function = function;
    }

    public static StonePaperScissors randomPattern() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static StonePaperScissors userPattern(String userInput) {
        return switch (userInput) {
            case "s" -> SCISSORS;
            case "p" -> PAPER;
            case "t" -> STONE;
            default -> null;
        };
    }

    public String getIsStrongerThan() {
        return isStrongerThan;
    }

    public String getFunction() {
        return function;
    }
}
