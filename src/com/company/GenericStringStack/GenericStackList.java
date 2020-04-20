package com.company.GenericStringStack;

import java.util.LinkedList;
import java.util.List;

public class GenericStackList<T> implements GenericStack<T> {

  private final List<T> stack;

  public GenericStackList() {
    stack = new LinkedList<>();
  }

  public void push(T s) {
    stack.add(s);
  }

  public T pop() {
    if (!isEmpty()) {
      return stack.remove(stack.size() - 1);
    }
    return null;
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

}
