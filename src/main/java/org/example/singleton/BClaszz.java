package org.example.singleton;

public class BClaszz {

    private SocketClient socketClient;

    public  BClaszz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
