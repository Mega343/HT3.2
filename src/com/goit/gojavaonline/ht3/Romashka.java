package com.goit.gojavaonline.ht3;

public class Romashka extends Flower implements Comparable{

   String color;
   int price;
   int lenght;



    public Romashka(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    public int compareTo(Object obj)
    {
        Romashka tmp = (Romashka) obj;
        if(this.price < tmp.price)
        {
            return -1;
        }
        else if(this.price > tmp.price)
        {
            return 1;
        }
        return 0;
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
