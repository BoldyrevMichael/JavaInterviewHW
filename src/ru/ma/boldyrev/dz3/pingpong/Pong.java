package ru.ma.boldyrev.dz3.pingpong;

public class Pong implements Runnable {

    private PingPongThreadController pingPongThreadController;

    Pong(PingPongThreadController pingPongThreadController) {
        this.pingPongThreadController = pingPongThreadController;
        new Thread(this, "Pong").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            pingPongThreadController.pong();
            i++;
        }
    }
}
