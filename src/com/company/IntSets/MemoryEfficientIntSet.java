package com.company.IntSets;

import com.company.StringStack.StringStackIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemoryEfficientIntSet extends AbstractIntSet {

  private final List<Integer> set;

  public MemoryEfficientIntSet() {
    set = new ArrayList<>();
  }

  @Override
  public void add(int x) {
    if (!contains(x)) {
      set.add(x);
    }
  }

  @Override
  public boolean remove(int x) {
    return set.remove(Integer.valueOf(x));
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
    return new MemoryIntSetIterator();
  }

  private class MemoryIntSetIterator implements IntSetIterator {

    Iterator<Integer> iterator;

    public MemoryIntSetIterator() {
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
