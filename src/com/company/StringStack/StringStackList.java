package com.company.StringStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack{

  private final List<String> stack;

  public StringStackList() {
    stack = new LinkedList<>();
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

}
