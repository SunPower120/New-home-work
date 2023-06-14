package io.codelex.Test_14_06_23.ThirdExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class JoinerTest {
    @Test
    void shouldJoinElementsWithSeparator() {
        Joiner<Integer> integerJoiner = new Joiner<>("-");
        String result = integerJoiner.join(Arrays.asList(1, 2, 3, 4, 5));
        Assertions.assertEquals("1-2-3-4-5", result);

        Joiner<String> stringJoiner = new Joiner<>(", ");
        String resultStr = stringJoiner.join(Arrays.asList("First", "Second", "!"));
        Assertions.assertEquals("First, Second, !", resultStr);
    }
}


