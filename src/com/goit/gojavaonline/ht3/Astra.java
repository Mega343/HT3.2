package com.goit.gojavaonline.ht3;

public class Astra extends Flower implements Comparable {

    String color;
    int price;
    int lenght;



    public Astra(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }

    public int compareTo(Object obj)
    {
        Astra tmp = (Astra) obj;
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
        return "Astra " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght;
    }
}
