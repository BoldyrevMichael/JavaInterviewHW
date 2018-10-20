package ru.ma.boldyrev.dz2;

public class MyArrayListTest {

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        System.out.println("Размер " + myArrayList.size());
        System.out.println(myArrayList);

        System.out.println("Удалили элемент с индексом 0: " + myArrayList.remove(0));
        System.out.println("Удалили элемент с индексом 0: " + myArrayList.remove(0));
        myArrayList.add(11);
        myArrayList.add(12);
        myArrayList.add(13);
        System.out.println("Размер " + myArrayList.size());
        System.out.println(myArrayList);
    }
}
