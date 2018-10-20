package ru.ma.boldyrev.dz1.third;

public class TestShape {

    public static void main(String[] args) {
        Shape[] listOfShape = new Shape[3];
        listOfShape[0] = new Quadrate(10);
        listOfShape[1] = new Triangle(10, 30);
        listOfShape[2] = new Сircle(10);

        for (Shape shape : listOfShape) {
            System.out.println(shape.getType() + " обладает площадью " + shape.getSquare());
        }
    }
}
