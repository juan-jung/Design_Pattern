package org.example.templateMethod;

public class Main {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();

        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
