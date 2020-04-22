package com.company.GenericIntSets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericMemoryEfficientSet<T> extends AbstractGenericSet<T> {

  private final List<T> set;

  public GenericMemoryEfficientSet() {
    set = new ArrayList<>();
  }

  @Override
  public void add(T x) {
    if (!contains(x)) {
      set.add(x);
    }
  }

  @Override
  public boolean remove(T x) {
    return set.remove(x);
  }

  @Override
  public boolean contains(T x) {
    return set.contains(x);
  }

  @Override
  public boolean isEmpty() {
    return set.isEmpty();
  }


  @Override
  public GenericSetIterator<T> iterator() {
    return new GenericMemoryIterator<T>();
  }

  private class GenericMemoryIterator<T> implements GenericSetIterator<T> {

    Iterator<T> iterator;

    public GenericMemoryIterator() {
      iterator = (Iterator<T>) set.iterator();
    }

    @Override
    public boolean hasNext() {
      return iterator.hasNext();
    }

    @Override
    public T next() {
      return iterator.next();
    }
  }
}
