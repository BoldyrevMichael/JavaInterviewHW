package ru.ma.boldyrev.dz1.third;

public class Quadrate extends Shape {

    private double side;

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}
