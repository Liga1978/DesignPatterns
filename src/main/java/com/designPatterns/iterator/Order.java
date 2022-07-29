package com.designPatterns.iterator;

import com.designPatterns.builder.Coffee;

import java.util.ArrayList;

public class Order implements Intermediate {

    public static ArrayList<Coffee> Bill = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new Billiterator();
    }

    public void addToList(Coffee coffee) {
        Bill.add(coffee);
    }

    public void itemsInOrder() {
        System.out.println("ordered items " + Bill.size());
    }
}
