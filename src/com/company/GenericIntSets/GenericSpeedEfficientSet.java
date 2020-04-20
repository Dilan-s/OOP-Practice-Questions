package com.company.GenericIntSets;

import java.util.HashSet;
import java.util.Set;

public class GenericSpeedEfficientSet<T> implements GenericSet<T> {

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
}
