package ru.ma.boldyrev.dz1.third;

public class Triangle extends Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getSquare() {
        return 0.5 * height * base;
    }

    @Override
    public String getType() {
        return "Треугольник";
    }
}
