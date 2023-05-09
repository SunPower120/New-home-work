package io.codelex.loops.practice;

import java.util.Random;

public class RandomGenerator {
    private final Random rand;

    public RandomGenerator() {
        rand = new Random();
    }

    public int generateRandomNumber() {
        return rand.nextInt(6) + 1;
    }
}
