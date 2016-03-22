package com.goit.gojavaonline.ht3;

import java.util.*;

public class Rose extends Flower implements Comparable{

    String color;
    int price;
    int lenght;



    public Rose(String color, int lenght, int price) {
        this.color = color;
        this.lenght = lenght;
        this.price = price;
    }





    public int compareTo(Object obj)
    {
        Rose tmp = (Rose) obj;
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
        return "Rose " +
                "color='" + color + '\'' +
                ", price=" + price +
                ", lenght=" + lenght;
    }

    public static void roseSort(ArrayList<Rose> name){
        Rose [] mas = new Rose[name.size()];

        for(int i = 0; i < name.size(); i++) {
            for(Rose rose : name){
                mas[i] = rose;
                i++;
            }
        }
        Arrays.sort(mas);
    ArrayList<Rose> sortedRoseList = new ArrayList<>();
        for(int i = 0; i < mas.length; i++){
            sortedRoseList.add(mas[i]);
        }
        for(Rose rose : sortedRoseList){
            System.out.println(rose);
        }
    }
}

