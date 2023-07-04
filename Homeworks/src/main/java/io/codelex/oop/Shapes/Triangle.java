package io.codelex.oop.Shapes;

public class Triangle extends Shape {
    private final double base;
    private final double rightSide;
    private final double leftSide;
    private final double height;


    public Triangle(double base, double rightSide, double leftSide, double height) {
        this.base = base;
        this.rightSide = rightSide;
        this.leftSide = leftSide;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return base + rightSide + leftSide;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }


}
