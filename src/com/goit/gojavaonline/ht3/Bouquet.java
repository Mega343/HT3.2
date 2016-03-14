package com.goit.gojavaonline.ht3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bouquet {

    HashSet<Flower> list;

    public Bouquet(Flower flower) {
        list.add(flower);
    }

    public Bouquet(HashSet<Flower> name) {
        if (!name.isEmpty())
           list.addAll(name);
        // else
        // error
    }

}
