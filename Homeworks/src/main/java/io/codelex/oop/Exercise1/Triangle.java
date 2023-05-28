package io.codelex.oop.Exercise1;

public class Triangle extends Shape {
    private final double width;
    private final double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return this.width + this.height + Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
}
