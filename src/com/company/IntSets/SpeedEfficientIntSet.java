package com.company.IntSets;

import java.util.HashSet;
import java.util.Set;

public class SpeedEfficientIntSet implements IntSet {

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
}
