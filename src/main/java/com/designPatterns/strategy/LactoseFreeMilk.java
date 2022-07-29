package com.designPatterns.strategy;

public class LactoseFreeMilk implements Strategy{
    @Override
    public String milk() {
        return "Lactose Free milk";
    }

    @Override
    public String toString() {
        return "Lactose Free Milk";
    }
}
