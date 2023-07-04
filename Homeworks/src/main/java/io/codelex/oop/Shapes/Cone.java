package io.codelex.oop.Shapes;

public class Cone extends A3DShape {

    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return ((double) 1 / 3) * Math.PI * radius * radius * height;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("This shape has no perimeter");
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
}
