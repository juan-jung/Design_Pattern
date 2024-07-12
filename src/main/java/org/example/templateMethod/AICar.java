package org.example.templateMethod;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("automatic driving");
    }

    @Override
    public void stop() {
        System.out.println("automatic stop");
    }
}
