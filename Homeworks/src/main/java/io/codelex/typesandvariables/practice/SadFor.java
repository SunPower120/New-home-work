package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;

public class SadFor {
    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {

        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5){
            System.out.println(i);}
        }

        throw new NoCodeWrittenException();
    }
}
