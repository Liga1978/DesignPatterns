package com.designPatterns.decorator;

import com.designPatterns.builder.Coffee;

public class WhippedCream extends CoffeeDecorator{

    private Coffee coffee;

    public final String WHIPPEDCREAM = "WhippedCream";

    public WhippedCream(Decorator customDecorator) {
        super(customDecorator);
    }

    public String decorateWithWhippedCream(){
        return WHIPPEDCREAM;
    }

    @Override
    public String decorate() {
        return customDecorator.decorate()+decorateWithWhippedCream()+" ";
    }

    @Override
    public double addPrice() {
        return customDecorator.addPrice() +70;
    }


}
