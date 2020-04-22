package com.company.StringStack;

public class StringStackArray extends AbstractStringStack {

  public final int MAX_STACK = 100;
  private final String[] stack;
  private int stackPointer;

  public StringStackArray() {
    stack = new String[MAX_STACK];
    stackPointer = 0;
  }

  @Override
  public void push(String s) {
    if (stackPointer < MAX_STACK) {
      stack[stackPointer] = s;
      stackPointer++;
    }
  }

  @Override
  public String pop() {
    if (stackPointer > 0) {
      stackPointer--;
      return stack[stackPointer];
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }

  @Override
  public StringStackIterator iterator() {
    return new StringStackArrayIterator();
  }

  private class StringStackArrayIterator implements StringStackIterator{

    private int current;

    public StringStackArrayIterator() {
      current = stackPointer - 1;
    }

    @Override
    public boolean hasNext() {
      return (current < MAX_STACK) && (0 <= current);
    }

    @Override
    public String next() {
      if (hasNext()){
        String res = stack[current];
        current--;
        return res;
      }
      return null;
    }
  }
}
