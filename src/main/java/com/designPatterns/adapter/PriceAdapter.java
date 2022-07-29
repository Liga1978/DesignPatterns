package com.designPatterns.adapter;

import java.util.Formatter;

public class PriceAdapter implements PriceInUsd {

    private final PriceInEur priceInEur;

    public PriceAdapter(PriceInEur priceInEur) {
        this.priceInEur = priceInEur;
    }

    @Override
    public double getPriceInUsd() {
        return priceInEur.getPriceInEur() * 1.1;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%.2f", priceInEur.getPriceInEur() * 1.1);
        return formatter.toString();
    }
}
