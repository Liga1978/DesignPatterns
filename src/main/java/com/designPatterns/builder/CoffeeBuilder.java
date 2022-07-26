package com.designPatterns.builder;

public class CoffeeBuilder {
    private String type;
    private String size;
    private boolean isSugar;

    public CoffeeBuilder() {
    }

    public static CoffeeBuilder aCoffee(){
        return new CoffeeBuilder();
    }

    public CoffeeBuilder withType(String type){
        this.type = type;
        return this;
    }

    public CoffeeBuilder withSize(String size){
        this.size = size;
        return this;
    }

    public CoffeeBuilder withSugar(boolean isSugar){
        this.isSugar = isSugar;
        return this;
    }

    public Coffee build(){
        return new Coffee(type, size, isSugar);
    }

}
