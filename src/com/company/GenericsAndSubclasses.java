package com.company;

import java.util.HashSet;
import java.util.Set;

public class GenericsAndSubclasses {

  public class A {

  }

  public class B extends A {

  }

  public static void main(String[] args) {

    Set<B> setOfB = new HashSet<B>();
    Set<? extends A> setOfA = setOfB;
  }
}
