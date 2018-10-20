package ru.ma.boldyrev.dz1.second;

interface Moveable {
    void move();
}

interface Stopable {
    void stop();
}

class Engine {
}

abstract class Car implements Moveable, Stopable {//считаю, что класс Car должен implements Moveable, Stopable
    private Engine engine;//неправильно применять публичный доступ к полям класса
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LightWeightCar extends Car {

    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {//легковесным машинам тоже нужно останавливаться
        System.out.println("Car is stop");
    }
}

class Lorry extends Car {//ошибка здесь была: интерфейсы не extends, а implements

    @Override//лучше указать аннотацию @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override//лучше указать аннотацию @Override
    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    void open() {//ошибка здесь была: не было реализации абстрактного метода родительского класса.
        System.out.println("Car is open");
    }
}
