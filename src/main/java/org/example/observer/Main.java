package org.example.observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("button");

        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("message send : click 1");
        button.click("message send : click 2");
        button.click("message send : click 3");
        button.click("message send : click 4");
    }
}
