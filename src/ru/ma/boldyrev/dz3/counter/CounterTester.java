package ru.ma.boldyrev.dz3.counter;

public class CounterTester {

    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 100; i++) {
            CounterThread counterThread = new CounterThread(counter);
            counterThread.start();
            try {
                counterThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(counter.getCount());
    }
}
