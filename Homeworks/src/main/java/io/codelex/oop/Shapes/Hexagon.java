package io.codelex.oop.Shapes;

public class Hexagon extends Shape {

    private final double side;


    public Hexagon(double side) {
        this.side = side;

    }

    @Override
    public double calculatePerimeter() {
        return side * 6;
    }

    @Override
    public double calculateArea() {
        return (5.196 * side * side) / 2;
    }

}

