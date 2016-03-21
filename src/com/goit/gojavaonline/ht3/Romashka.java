package com.goit.gojavaonline.ht3;

public class Romashka extends Flower {

   String color;
   int price;
   int lenght;



    public Romashka(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Romashka " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght
                ;
    }
}
