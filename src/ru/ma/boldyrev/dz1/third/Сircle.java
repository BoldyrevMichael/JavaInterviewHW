package ru.ma.boldyrev.dz1.third;

public class Сircle extends Shape {

    private double radius;

    public Сircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getType() {
        return "Окружность";
    }
}
