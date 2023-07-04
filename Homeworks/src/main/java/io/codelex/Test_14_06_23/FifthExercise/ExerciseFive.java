package io.codelex.Test_14_06_23.FifthExercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExerciseFive {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 0);
        System.out.println(evenPercent);
    }

    public static <T> double partOf(List<T> list, Predicate<T> predicate) {
        long count = list.stream().filter(predicate).count();
        return (double) count / list.size();
    }
}

