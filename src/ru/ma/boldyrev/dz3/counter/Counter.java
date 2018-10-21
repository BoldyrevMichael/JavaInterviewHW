package ru.ma.boldyrev.dz3.counter;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    long count = 0L;

    private Lock lock = new ReentrantLock();

    public void incrementCount() {
        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)) {
                try {
                    count++;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Не удалось получить блокировку за установленное время.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long getCount() {
        return count;
    }
}
