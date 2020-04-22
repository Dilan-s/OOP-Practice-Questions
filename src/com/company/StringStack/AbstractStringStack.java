package com.company.StringStack;

public abstract class AbstractStringStack implements StringStack {

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    StringStackIterator iterator = iterator();
    boolean first = true;
    while (iterator.hasNext()){
      if (first){
        first = false;
      } else {
        sb.append(", ");
      }
      sb.append(iterator.next());
    }
    return sb.toString();
  }
}
