package org.example.adapter;

public class AirConditioner implements Electronic220V{

    @Override
    public void powerOn() {
        System.out.println("AC 220v on");
    }
}
