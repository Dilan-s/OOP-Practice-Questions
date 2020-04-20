package com.company.GenericIntSets;

public interface GenericSet<T> {

  void add(T x);

  boolean remove(T x);

  boolean contains(T x);

  boolean isEmpty();

}
