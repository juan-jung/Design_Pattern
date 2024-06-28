package org.example.facade;

public class Ftp {
    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path) {
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect() {
        System.out.println("FTP Host : " + host + " ,Port : " + port + " connect");
    }

    public void moveDirectory() {
        System.out.println("path : " + path + " move");
    }

    public void disconnect() {
        System.out.println("FTP disconnect");
    }
}
