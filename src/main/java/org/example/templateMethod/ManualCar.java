package org.example.templateMethod;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("muanually drive");
    }

    @Override
    public void stop() {
        System.out.println("manually stop");
    }
}
