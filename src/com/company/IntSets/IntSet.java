package com.company.IntSets;

public interface IntSet {

  void add(int x);

  boolean remove(int x);

  boolean contains(int x);

  boolean isEmpty();

  IntSetIterator iterator();

  void addAll(IntSet other);

  void removeALl(IntSet other);

  boolean contains(IntSet other);

}
