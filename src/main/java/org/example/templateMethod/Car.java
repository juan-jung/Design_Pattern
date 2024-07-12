package org.example.templateMethod;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("power on");
    }

    public void turnOff() {
        System.out.println("power off");
    }

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
