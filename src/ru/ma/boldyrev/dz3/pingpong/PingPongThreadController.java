package ru.ma.boldyrev.dz3.pingpong;

public class PingPongThreadController {

    boolean flag = true;

    synchronized void ping() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping!");
        flag = false;
        notify();
    }

    synchronized void pong() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pong!");
        flag = true;
        notify();
    }
}
