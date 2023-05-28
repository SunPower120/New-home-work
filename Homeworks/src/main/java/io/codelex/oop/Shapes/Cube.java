package io.codelex.oop.Shapes;

public class Cube extends A3DShape {

    private final double side;


    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculatePerimeter() {
        return side * 12;
    }

    @Override
    public double calculateArea() {
        return side * side * 6;
    }
}
