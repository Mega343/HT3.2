package com.goit.gojavaonline.ht3;

public class Tulip extends Flower {

    String color;
    int price;
    int lenght;


    public Tulip(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tulip " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght;
    }
}
