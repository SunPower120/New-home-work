package io.codelex.oop.generics;


import io.codelex.oop.summary.generics.Combiner;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CombinerTest {

    @Test
    public void shouldCombineListAndString() {
        List<String> first = Arrays.asList("Hello", "World");
        String second = "Greetings";
        String result = Combiner.combineTwoItems(first, second);

        assertEquals("First item: [Hello, World]; Second item: Greetings", result);
    }
}
