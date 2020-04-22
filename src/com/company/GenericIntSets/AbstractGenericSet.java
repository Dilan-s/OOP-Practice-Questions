package com.company.GenericIntSets;

import com.company.IntSets.IntSet;

public abstract class AbstractGenericSet<S> implements GenericSet<S> {

  public void addAll(GenericSet<S> other) {
    GenericSetIterator<S> iterator = other.iterator();
    while (iterator.hasNext()){
      add(iterator.next());
    }
  }

  public void removeALl(GenericSet<S> other) {
    GenericSetIterator<S> iterator = other.iterator();
    while (iterator.hasNext()){
      remove(iterator.next());
    }
  }

  public boolean contains(GenericSet<S> other) {
    GenericSetIterator<S> iterator = other.iterator();
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
    GenericSetIterator<S> iterator = iterator();
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
