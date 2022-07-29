package com.designPatterns.builder;

import com.designPatterns.decorator.Decorator;
import com.designPatterns.strategy.Context;
import com.designPatterns.strategy.Strategy;

public class CoffeeBuilder {
    private Decorator decorator;
    private Context context;
    private String type;
    private String size;
    private int sugar;
    private double price;

    public CoffeeBuilder() {
    }

    public static CoffeeBuilder aCoffee() {
        return new CoffeeBuilder();
    }

    public CoffeeBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public CoffeeBuilder withSize(String size) {
        this.size = size;
        return this;
    }

    public CoffeeBuilder withSugar(int sugar) {
        this.sugar = sugar;
        return this;
    }

    public CoffeeBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public CoffeeBuilder withDecorator(Decorator decorator) {
        this.decorator = decorator;
        return this;
    }

    public CoffeeBuilder withStrategy(Context context) {
        this.context = context;
        return this;
    }


    public Coffee build() {
        return new Coffee(type, size, sugar, price, decorator, context);
    }


}
