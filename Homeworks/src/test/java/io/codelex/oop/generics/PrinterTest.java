package io.codelex.oop.generics;

import io.codelex.oop.summary.generics.Printer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void shouldStoreStringObject() {
        String thing = "Something something to test!";
        Printer printer = new Printer(thing);
        assertEquals(thing, printer.getThingToPrint());
    }

    @Test
    public void shouldStoreIntegerObject() {
        Integer thing = 123;
        Printer printer = new Printer(thing);
        assertEquals(thing, printer.getThingToPrint());
    }

}

