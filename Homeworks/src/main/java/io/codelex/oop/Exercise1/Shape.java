package io.codelex.oop.Exercise1;

public abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
