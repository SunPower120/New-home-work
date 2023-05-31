package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Mercedes");
        cars.add("VolksWagen");
        cars.add("Mercedes");
        cars.add("Tesla");
        System.out.println(cars);

        Map<Integer, String> cars2 = new HashMap<>();
        cars2.put(1, "Audi");
        cars2.put(2, "BMW");
        cars2.put(3, "Honda");
        cars2.put(4, "Mercedes");
        cars2.put(5, "VolksWagen");
        cars2.put(6, "Mercedes");
        cars2.put(7, "Tesla");
        System.out.println(cars2);

        Set<String> cars3 = new HashSet<>();
        cars3.add("Audi");
        cars3.add("BMW");
        cars3.add("Honda");
        cars3.add("Mercedes");
        cars3.add("VolksWagen");
        cars3.add("Mercedes");
        cars3.add("Tesla");
        System.out.println(cars3);

    }
}
