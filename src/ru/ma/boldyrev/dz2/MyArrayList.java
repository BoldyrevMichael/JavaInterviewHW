package ru.ma.boldyrev.dz2;

import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public MyArrayList() {
        capacity = DEFAULT_CAPACITY;
        elements = new Object[capacity];
    }

    public MyArrayList(int initialCapacity) {
        capacity = initialCapacity;
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if ((size + 1) <= capacity) {
            elements[size++] = element;
        } else {
            resize();
            elements[size++] = element;
        }
    }

    public void add(T element, int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        if ((size + 1) <= capacity) {
            for (int i = index; i < size; i++) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        } else {
            resize();
            for (int i = index; i < size; i++) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public T remove(int index) {
        T tempElement = (T) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return tempElement;
    }

    void resize() {
        capacity *= 2;
        elements = Arrays.copyOf(elements, capacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            sb.append("[").append(elements[i].toString()).append("], ");
        }
        sb.replace(sb.lastIndexOf(", "), sb.lastIndexOf(", ") + 2, "}");
        return sb.toString();
    }
}
