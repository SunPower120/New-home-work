package io.codelex.streams.practice;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.Collections.emptySet;

public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, Character> accumulator() {
        return StringBuilder::append;
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (builder1, builder2) -> {
            builder1.append(builder2);
            return builder1;
        };
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return StringBuilder::toString;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return emptySet();
    }
}
