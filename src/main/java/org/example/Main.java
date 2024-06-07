package org.example;

import org.example.singleton.AClazz;
import org.example.singleton.BClaszz;
import org.example.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClaszz bClaszz = new BClaszz();

        SocketClient aclient = aClazz.getSocketClient();
        SocketClient bclient = bClaszz.getSocketClient();

        System.out.println(aclient.equals(bclient));
    }
}