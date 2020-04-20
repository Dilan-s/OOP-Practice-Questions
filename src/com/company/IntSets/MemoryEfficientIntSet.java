package com.company.IntSets;

import java.util.ArrayList;
import java.util.List;

public class MemoryEfficientIntSet implements IntSet {

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
}
