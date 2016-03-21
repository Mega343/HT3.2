package com.goit.gojavaonline.ht3;

public class Astra extends Flower {

    String color;
    int price;
    int lenght;



    public Astra(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Astra " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght;
    }
}
