package com.company.IntSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SpeedEfficientIntSet extends AbstractIntSet {

  private final Set<Integer> set;

  public SpeedEfficientIntSet() {
    set = new HashSet<>();
  }

  @Override
  public void add(int x) {
    set.add(x);
  }

  @Override
  public boolean remove(int x) {
    return set.remove(x);
  }

  @Override
  public boolean contains(int x) {
    return set.contains(x);
  }

  @Override
  public boolean isEmpty() {
    return set.isEmpty();
  }

  @Override
  public IntSetIterator iterator() {
    return new SpeedIntSetIterator();
  }

  private class SpeedIntSetIterator implements IntSetIterator {

    Iterator<Integer> iterator;

    public SpeedIntSetIterator() {
      iterator = set.iterator();
    }

    @Override
    public boolean hasNext() {
      return iterator.hasNext();
    }

    @Override
    public int next() {
      return iterator.next();
    }
  }
}
