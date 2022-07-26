package com.designPatterns;

import com.designPatterns.builder.Coffee;
import com.designPatterns.builder.CoffeeBuilder;

public class Main {
    public static void main(String[] args) {
        final Coffee coffee = CoffeeBuilder.aCoffee()
                .withType("espresso")
                .withSize("large")
                .withSugar(true)
                .build();

        System.out.println(coffee);
    }
}
