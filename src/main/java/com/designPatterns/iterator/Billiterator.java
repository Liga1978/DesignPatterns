package com.designPatterns.iterator;

import static com.designPatterns.iterator.Order.Bill;

public class Billiterator implements Iterator {
    public Order order;
    int pos = 0;

    public Billiterator() {
        order = new Order();
    }

    @Override
    public boolean hasNext() {
        return pos < Bill.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return Bill.get(pos++);
        }
        return null;
    }
}
