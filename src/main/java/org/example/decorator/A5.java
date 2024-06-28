package org.example.decorator;

import java.util.Arrays;

public class A5 extends AudiDecorator{
    public A5(ICar audi, String modelName) {
        super(audi, modelName, 3000);
    }

}
