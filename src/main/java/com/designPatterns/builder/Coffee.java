package com.designPatterns.builder;

public class Coffee {
    private final String type;
    private final String size;
    private final boolean isSugar;

    public Coffee(String type, String size, boolean isSugar) {
        this.type = type;
        this.size = size;
        this.isSugar = isSugar;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isSugar() {
        return isSugar;
    }

    @Override
    public String toString() {
        return "Coffee" +
                "type: " + type +
                ", size: " + size +
                ", isSugar: " + isSugar;
    }
}
