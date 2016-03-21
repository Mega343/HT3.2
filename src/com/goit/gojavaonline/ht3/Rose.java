package com.goit.gojavaonline.ht3;

import java.util.*;

public class Rose extends Flower{

    String color;
    int price;
    int lenght;



    public Rose(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rose " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght;
    }
}
