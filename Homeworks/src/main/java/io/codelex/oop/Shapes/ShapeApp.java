package io.codelex.oop.Shapes;

public class ShapeApp {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 5, 5, 4);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Hexagon hexagon = new Hexagon(3);
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());

        Cone cone = new Cone(2, 5);
        System.out.println(cone.calculateVolume());
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculatePerimeter());

        Cube cube = new Cube(5);
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateVolume());
        System.out.println(cube.calculatePerimeter());
    }
}
