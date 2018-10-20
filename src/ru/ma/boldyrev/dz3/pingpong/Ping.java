package ru.ma.boldyrev.dz3.pingpong;

public class Ping implements Runnable {

    private PingPongThreadController pingPongThreadController;

    Ping(PingPongThreadController pingPongThreadController) {
        this.pingPongThreadController = pingPongThreadController;
        new Thread(this, "Ping").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            pingPongThreadController.ping();
            i++;
        }
    }
}
