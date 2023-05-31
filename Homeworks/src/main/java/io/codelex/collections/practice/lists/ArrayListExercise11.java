package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Color6");
        colors.add("Color7");
        colors.add("Color8");
        colors.add("Color9");
        colors.add("Color10");
        //TODO: Create an ArrayList with String elements
        //TODO: Add 10 values to list

        colors.set(4, "newColor5");
        //TODO: Add new value at 5th position

        int lastIndex = colors.size() - 1;
        colors.set(lastIndex, "NewLastColor");
        //TODO: Change value at last position (Calculate last position programmatically)

        colors.sort(Comparator.naturalOrder());
        //TODO: Sort your list in alphabetical order

        if (colors.contains("Foobar")) {
            System.out.println("Lists contains Foobar");
        } else {
            System.out.println("List do not contain Foobar");
        }
        //TODO: Check if your list contains "Foobar" element

        for (String loop : colors) {
            System.out.println(loop);
        }
        //TODO: Print each element of list using loop
    }

}
