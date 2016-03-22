package com.goit.gojavaonline.ht3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flower implements Comparable{
  public   String color;
  public   int price;
  public  int lenght;

    public int compareTo(Object obj)
    {
        Flower tmp = (Flower) obj;
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


}
