package com.goit.gojavaonline.ht3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FlowerShop {



   static int countOfRose;
   static  int countOfRomashka;
   static int countOfTulip;
   static int countOfAstra;
   static int lenghtOfRose;
   static int lenghtOfTulip;
   static int lenghtOfRomashka;
   static int lenghtOfAstra;
   static int priceOfRose;
   static int priceOfTulip;
   static int priceOfRomashka;
   static int priceOfAstra;
   static String colorOfRose;
   static String colorOfTulip;
   static String colorOfRomashka;
   static String colorOfAstra;
   static boolean addFlowersToShop = true;
   static String answer;

    public FlowerShop(ArrayList<Flower> flowers) {
    }

    public static void main(String[] args) throws IOException {


        ArrayList<Flower> flowers = new ArrayList<>();  // Коллекция которая содержит объекты разных типов
        FlowerShop flowerShop = new FlowerShop(flowers);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(addFlowersToShop) {

            System.out.println("Enter numbers of Rose");
            countOfRose = Integer.parseInt(reader.readLine());
            System.out.println("Enter length of Rose");
            lenghtOfRose = Integer.parseInt(reader.readLine());
            System.out.println("Enter price of Rose");
            priceOfRose = Integer.parseInt(reader.readLine());
            System.out.println("Enter color of Rose");
            colorOfRose = reader.readLine();


            for (int i = 0; i < countOfRose; i++) {
                flowers.add(new Rose(colorOfRose, lenghtOfRose, priceOfRose));
            }

            System.out.println("Would you like add another Rose? Enter \"yes\" or \"no\"");
            answer = reader.readLine();
            addFlowerToShop(answer);
        }

        addFlowersToShop = true;

        while(addFlowersToShop) {
            System.out.println("Enter numbers of Tulip");
            countOfTulip = Integer.parseInt(reader.readLine());
            System.out.println("Enter length of Tulip");
            lenghtOfTulip = Integer.parseInt(reader.readLine());
            System.out.println("Enter price of Tulip");
            priceOfTulip = Integer.parseInt(reader.readLine());
            System.out.println("Enter color of Tulip");
            colorOfTulip = reader.readLine();

            for (int i = 0; i < countOfTulip; i++) {
                flowers.add(new Tulip(colorOfTulip, lenghtOfTulip, priceOfTulip));
            }

            System.out.println("Would you like add another Tulip? Enter \"yes\" or \"no\"");
            answer = reader.readLine();
            addFlowerToShop(answer);
        }

        addFlowersToShop = true;

        while(addFlowersToShop) {
            System.out.println("Enter numbers of Romashka");
            countOfRomashka = Integer.parseInt(reader.readLine());
            System.out.println("Enter length of Romashka");
            lenghtOfRomashka = Integer.parseInt(reader.readLine());
            System.out.println("Enter price of Romashka");
            priceOfRomashka = Integer.parseInt(reader.readLine());
            System.out.println("Enter color of Romashka");
            colorOfRomashka = reader.readLine();

            for (int i = 0; i < countOfRomashka; i++) {
                flowers.add(new Romashka(colorOfRomashka, lenghtOfRomashka, priceOfRomashka));
            }

            System.out.println("Would you like add another Romaska? Enter \"yes\" or \"no\"");
            answer = reader.readLine();
            addFlowerToShop(answer);
        }

        addFlowersToShop = true;

        while(addFlowersToShop) {
             System.out.println("Enter numbers of Astra");
             countOfAstra = Integer.parseInt(reader.readLine());
             System.out.println("Enter length of Astra");
             lenghtOfAstra = Integer.parseInt(reader.readLine());
             System.out.println("Enter price of Astra");
              priceOfAstra = Integer.parseInt(reader.readLine());
             System.out.println("Enter color of Astra");
             colorOfAstra = reader.readLine();

        for (int i = 0; i < countOfAstra; i++){
            flowers.add(new Astra(colorOfAstra, lenghtOfAstra, priceOfAstra));
        }
            System.out.println("Would you like add another Astra? Enter \"yes\" or \"no\"");
            answer = reader.readLine();
            addFlowerToShop(answer);
        }

        RoseShrub roseShrub = new RoseShrub();

        HashMap<Integer, Integer> listofRoseShurbs = new HashMap<>(); // Теперь коллекций стало несколько =)
        roseShrub.listofRoseShurbsAdder(listofRoseShurbs);
        printList(flowers);
        printMap(listofRoseShurbs);



    }

        public static void addFlowerToShop(String answer){
         if (answer.equals("yes")) {
             addFlowersToShop = true;
         }
         if (answer.equals("no")) {
            addFlowersToShop = false;
        }
         if(!answer.equals("yes") && !answer.equals("no")){
             System.out.println("Invalid enter.");
             addFlowersToShop = false;
         }
        }

    public static void printList(ArrayList<Flower> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void printMap(Map<Integer,Integer> list) {
        for (Map.Entry<Integer, Integer> pair : list.entrySet())
        {
            System.out.println("On the " + pair.getKey() + " shurb - " + pair.getValue() + " roses.");
        }
    }

}


