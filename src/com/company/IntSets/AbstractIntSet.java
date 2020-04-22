package com.company.IntSets;

public abstract class AbstractIntSet implements IntSet {

  public void addAll(IntSet other) {
    IntSetIterator iterator = other.iterator();
    while (iterator.hasNext()){
      add(iterator.next());
    }
  }

  public void removeALl(IntSet other) {
    IntSetIterator iterator = other.iterator();
    while (iterator.hasNext()){
      remove(iterator.next());
    }
  }

  public boolean contains(IntSet other) {
    IntSetIterator iterator = other.iterator();
    boolean b1 = true;
    while (iterator.hasNext()){
      b1 = contains(iterator.next()) && b1;
    }
    return b1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    IntSetIterator iterator = iterator();
    boolean first = true;
    while (iterator.hasNext()) {
      if (first) {
        first = false;
      } else {
        sb.append(", ");
      }
      sb.append(iterator.next());
    }
    sb.append("]");
    return sb.toString();
  }
}
