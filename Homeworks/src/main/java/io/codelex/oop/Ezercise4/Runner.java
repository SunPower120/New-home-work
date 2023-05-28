package io.codelex.oop.Ezercise4;

public enum Runner {
    BEGINNER(240, 360),
    INTERMEDIATE(180, 239),
    ADVANCED(0, 179);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        for (Runner runner : Runner.values()) {
            if (time >= runner.getMinTime() && time <= runner.getMaxTime()) {
                return runner;
            }
        }
        throw new IllegalArgumentException("Invalid time provided");
    }
}
