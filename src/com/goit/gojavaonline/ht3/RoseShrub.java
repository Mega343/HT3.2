package com.goit.gojavaonline.ht3;



import java.io.*;
import java.util.*;

public class RoseShrub {


    public  void   listofRoseShurbsAdder(HashMap<Integer,Integer> listofRoseShurbs) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quantity of shurbs");
        int countOfShurbs = Integer.parseInt(reader.readLine());
        for(int i = 0; i < countOfShurbs; i++){
            System.out.println("Enter number of Shurb");
            Integer number = Integer.parseInt(reader.readLine());
            System.out.println("Enter quantity of Roses on the bush");
            Integer quantity = Integer.parseInt(reader.readLine());
            listofRoseShurbs.put(number,quantity);
        }

    }

}
