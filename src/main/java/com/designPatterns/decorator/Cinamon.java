package com.designPatterns.decorator;

import com.designPatterns.builder.Coffee;

public class Cinamon extends CoffeeDecorator {
 private Coffee coffee;


    public final String CINAMON = "Cinamon";

    public Cinamon(Decorator customDecorator) {
        super(customDecorator);
    }

    public String decorateWithCinamon() {
        return CINAMON;
    }

    @Override
    public String decorate() {
        return customDecorator.decorate() + decorateWithCinamon() + " ";
    }

    @Override
    public double addPrice() {
        return customDecorator.addPrice() + 50;
    }

}
