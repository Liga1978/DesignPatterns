package com.designPatterns.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy(){
        return strategy.milk();
    }

    @Override
    public String toString() {
        return "" + strategy;
    }
}
