package com.company.GenericIntSets;

import com.company.IntSets.IntSetIterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSpeedEfficientSet<T> extends AbstractGenericSet<T> {

  private final Set<T> set;

  public GenericSpeedEfficientSet() {
    set = new HashSet<>();
  }

  @Override
  public void add(T x) {
    set.add(x);
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
    return new GenericSpeedIterator<T>();
  }
  private class GenericSpeedIterator<T> implements GenericSetIterator<T> {

    Iterator<T> iterator;

    public GenericSpeedIterator() {
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
