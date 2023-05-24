package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {

        methodB();
    }

    public void methodB() throws ArithmeticException {
        methodC();
    }

    public void methodC() throws ArithmeticException {

        int result = 10 / 0;
    }

    public static void main(String[] args) {
        Exercise2 exercise = new Exercise2();

        try {
            exercise.methodA();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            exercise.methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        try {
            exercise.methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

