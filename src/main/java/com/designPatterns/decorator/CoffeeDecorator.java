package com.designPatterns.decorator;

import com.designPatterns.builder.Coffee;

public abstract class CoffeeDecorator implements Decorator {
    protected Decorator customDecorator;
    protected Coffee coffee;

    public CoffeeDecorator(Decorator customDecorator) {
        this.customDecorator = customDecorator;
    }

    @Override
    public String decorate() {
        return customDecorator.decorate();
    }

    @Override
    public double addPrice() {
        return customDecorator.addPrice();
    }


}
