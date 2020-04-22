package com.company.GenericIntSets;

import com.company.IntSets.IntSet;

public interface GenericSet<T> {

  void add(T x);

  boolean remove(T x);

  boolean contains(T x);

  boolean isEmpty();

  void addAll(GenericSet<T> other);

  void removeALl(GenericSet<T> other);

  boolean contains(GenericSet<T> other);

  GenericSetIterator<T> iterator();
}
