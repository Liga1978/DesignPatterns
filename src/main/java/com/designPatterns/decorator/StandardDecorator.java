package com.designPatterns.decorator;

public class StandardDecorator implements Decorator {


    @Override
    public String decorate() {
        return " ";
    }

    @Override
    public double addPrice() {
        return 0;
    }


}
