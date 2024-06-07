package org.example.adapter;

public class SocketApater implements Electronic110V{

    private Electronic220V electronic220V;

    public SocketApater(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        electronic220V.powerOn();
    }
}
