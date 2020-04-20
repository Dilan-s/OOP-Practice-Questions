package com.company.GenericIntSets;

import java.util.ArrayList;
import java.util.List;

public class GenericMemoryEfficientSet<T> implements GenericSet<T> {

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
}
