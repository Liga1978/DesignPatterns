package com.designPatterns;

import com.designPatterns.adapter.PriceAdapter;
import com.designPatterns.adapter.PriceInEur;
import com.designPatterns.adapter.PriceInUsd;
import com.designPatterns.builder.Coffee;
import com.designPatterns.builder.CoffeeBuilder;
import com.designPatterns.decorator.Cinamon;
import com.designPatterns.decorator.Decorator;
import com.designPatterns.decorator.StandardDecorator;
import com.designPatterns.decorator.WhippedCream;
import com.designPatterns.iterator.Iterator;
import com.designPatterns.iterator.Order;
import com.designPatterns.strategy.Context;
import com.designPatterns.strategy.LactoseFreeMilk;

public class Main {
    public static void main(String[] args) {

        Decorator decorator = new StandardDecorator();
        decorator = new Cinamon(decorator);
        decorator = new WhippedCream(decorator);

        Context context = new Context(new LactoseFreeMilk());
        final Coffee coffee = CoffeeBuilder.aCoffee()
                .withType("Espresso")
                .withSize("small")
                .withSugar(1)
                .withPrice(100)
                .withDecorator(decorator)
                .withStrategy(context)
                .build();

        final PriceInEur priceInEur = new PriceInEur(coffee.getPrice());
        final PriceInUsd priceInUsd = new PriceAdapter(priceInEur);

        Decorator decorator2 = new StandardDecorator();
        decorator2 = new WhippedCream(decorator2);
        Context context2 = new Context(null);
        final Coffee coffee2 = CoffeeBuilder.aCoffee()
                .withType("Americano")
                .withSize("large")
                .withSugar(2)
                .withPrice(120)
                .withDecorator(decorator2)
                .withStrategy(context2)
                .build();

        printCoffee(coffee);

        System.out.println();
        System.out.println("Coffee price in USD: "+priceInUsd + " USD");

        System.out.println("*****");
        printCoffee(coffee2);
        System.out.println();
        System.out.println("*****");


        Order order = new Order();
        order.addToList(coffee);
        order.addToList(coffee2);
        Iterator iterator = order.getIterator();
        System.out.println("Information from Order Iterator:");

        while (iterator.hasNext()) {
            Coffee coffeeIt = (Coffee) iterator.next();
            System.out.println();
            System.out.println("Order information: " + coffeeIt.getType() + ": " + coffeeIt.getPrice() + " EUR");
        }
        System.out.println();
        System.out.println("Printing number of items in order");
        order.itemsInOrder();
    }

    private static void printCoffee(final Coffee cofee) {
        System.out.println("Printing coffee order information: ");
        System.out.println("type: " + cofee.getType());
        System.out.println("size: " + cofee.getSize());
        System.out.println("sugar: " + cofee.getSugar());
        System.out.println("decorator: " + cofee.getDecorator().decorate());
        System.out.println("milk type: " + cofee.getContext());
        System.out.print("Coffee price: " + cofee.getPrice() + " EUR");

    }
}
