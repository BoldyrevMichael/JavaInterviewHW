package ru.ma.boldyrev.dz2;

public class MyLinkedList<T> {

    private int size = 0;
    private Node<T> head;
    private Node<T> tail;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if (size == 0) {
            Node<T> newElement = new Node<>(null, element, null);
            head = newElement;
            tail = newElement;
            size++;
        } else {
            Node<T> newElement = new Node<>(tail, element, null);
            tail.next = newElement;
            tail = newElement;
            size++;
        }
    }

    public void remove() {
        remove(size == 0 ? size : size - 1);
    }

    public void add(T element, int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            Node<T> newElement = new Node<>(null, element, head);
            head.next.prev = newElement;
            head = newElement;
            size++;
            return;
        }
        if (index == size - 1) {
            Node<T> newElement = new Node<>(tail.prev, element, tail);
            tail.prev.next = newElement;
            tail.prev = newElement;
            size++;
            return;
        }
        Node<T> tempElement = head.next;
        int count = 1;
        while (count != size - 1) {
            if (count == index) {
                Node<T> newElement = new Node<>(tempElement.prev, element, tempElement.next);
                tempElement.prev.next = newElement;
                tempElement.prev = newElement;
                break;
            }
            tempElement = tempElement.next;
            count++;
        }
    }

    public T get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            return head.item;
        }
        if (index == size - 1) {
            return tail.item;
        }
        Node<T> tempElement = head.next;
        int count = 1;
        while (count != size - 1) {
            if (count == index) {
                return tempElement.item;
            }
            tempElement = tempElement.next;
            count++;
        }
        return null;
    }

    public T remove(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            Node<T> tempElement = head;
            head.next.prev = null;
            head = head.next;
            tempElement.next = null;
            size--;
            return tempElement.item;
        }
        if (index == size - 1) {
            Node<T> tempElement = tail;
            tail.prev.next = null;
            tail = tail.prev;
            tempElement.prev = null;
            size--;
            return tempElement.item;
        }
        Node<T> tempElement = head.next;
        int count = 1;
        while (count != size - 1) {
            if (count == index) {
                tempElement.prev.next = tempElement.next;
                tempElement.next.prev = tempElement.prev;
                tempElement.prev = null;
                tempElement.next = null;
                return tempElement.item;
            }
            tempElement = tempElement.next;
            count++;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node<T> tempElement = head;
        int count = 0;
        while (count != size) {
            sb.append("[").append(tempElement.item.toString()).append("], ");
            tempElement = tempElement.next;
            count++;
        }
        sb.replace(sb.lastIndexOf(", "), sb.lastIndexOf(", ") + 2, "}");
        return sb.toString();
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
