package com.goit.gojavaonline.ht3;


import java.util.*;

public class RoseShrub {

 HashSet<Rose> list;

  public RoseShrub(Rose rose) {
    list.add(rose);
  }

  public RoseShrub(HashSet<Rose> name) {
    if (!name.isEmpty())
      list.addAll(name);
   // else
    // error
  }

}
