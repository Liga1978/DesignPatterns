package com.designPatterns.builder;

import com.designPatterns.decorator.Decorator;
import com.designPatterns.strategy.Context;

public class Coffee {
    private final Decorator decorator;
    private final Context context;
    private final String type;
    private final String size;
    private final int sugar;
    private final double price;


    public Coffee(String type, String size, int sugar, double price, Decorator decorator, Context context) {
        this.type = type;
        this.size = size;
        this.sugar = sugar;
        this.price = price;
        this.decorator = decorator;
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public Context getContext() {
        return context;
    }

    public double getPrice() {
        return (price + decorator.addPrice()) / 100;
    }

    public int getSugar() {
        return sugar;
    }
}
