package com.company.StringStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringStackList extends AbstractStringStack{

  private final List<String> stack;

  public StringStackList() {
    stack = new ArrayList<>();
  }

  public void push(String s) {
    stack.add(s);
  }

  public String pop() {
    if (!isEmpty()) {
      return stack.remove(stack.size() - 1);
    }
    return null;
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  @Override
  public StringStackIterator iterator() {
    return new StringStackListIterator();
  }

  private class StringStackListIterator implements StringStackIterator{

    Iterator<String> iterator;

    public StringStackListIterator() {
      iterator = stack.iterator();
    }

    @Override
    public boolean hasNext() {
      return iterator.hasNext();
    }

    @Override
    public String next() {
      return iterator.next();
    }
  }
}
