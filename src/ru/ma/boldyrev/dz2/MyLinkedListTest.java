package ru.ma.boldyrev.dz2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(8);
        myLinkedList.add(9);
        myLinkedList.add(10);
        System.out.println("Размер " + myLinkedList.size());
        System.out.println(myLinkedList);

        System.out.println("Удалили элемент с индексом 0: " + myLinkedList.remove(0));
        System.out.println("Удалили элемент с индексом 0: " + myLinkedList.remove(0));
        myLinkedList.add(11);
        myLinkedList.add(12);
        myLinkedList.add(13);
        System.out.println("Размер " + myLinkedList.size());
        System.out.println(myLinkedList);
    }
}
