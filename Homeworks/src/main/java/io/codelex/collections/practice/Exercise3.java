package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Red");
        mySet.add("Black");
        mySet.add("Yellow");
        mySet.add("Color4");
        mySet.add("Color5");
        mySet.add("Color6");
        mySet.add("Color7");
        mySet.add("Color8");


        System.out.println("Should have 5 elements: " + mySet); //Pay attention on order!

        //TODO: iterate through all elements in set

        for (String element : mySet) {
            System.out.println(element);
        }

        mySet.clear();
        //TODO: remove all values from set
        System.out.println("Should be empty: " + mySet);

        //TODO: check if it is possible to add duplicated values
        mySet.add("Green");
        mySet.add("Orange");
        mySet.add("Green");
        mySet.add("Purple");

        System.out.println(mySet);
    }

}
