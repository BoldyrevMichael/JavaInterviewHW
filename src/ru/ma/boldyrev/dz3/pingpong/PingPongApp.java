package ru.ma.boldyrev.dz3.pingpong;

public class PingPongApp {

    public static void main(String[] args) {
        PingPongThreadController pingPongThreadController = new PingPongThreadController();
        new Ping(pingPongThreadController);
        new Pong(pingPongThreadController);
    }
}
