package com.company.GenericStringStack;

public class GenericStackArray<T> implements GenericStack<T> {

  public final int MAX_STACK = 100;
  private final T[] stack;
  private int stackPointer;

  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    stack = (T[]) new Object[MAX_STACK];
    stackPointer = 0;
  }

  public void push(T s){
    if (stackPointer < MAX_STACK){
      stack[stackPointer] = s;
      stackPointer++;
    }
  }

  public T pop(){
    if (stackPointer > 0){
      stackPointer--;
      return stack[stackPointer];
    }
    return null;
  }

  public boolean isEmpty(){
    return stackPointer == 0;
  }
}
