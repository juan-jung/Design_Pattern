package org.example.adapter;

public class Main {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new SocketApater(airConditioner);
        connect(adapter);
    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
