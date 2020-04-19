package com.company.StringStack;

public class StringStackArray implements StringStack{

  public final int MAX_STACK = 100;
  private final String[] stack;
  private int stackPointer;

  public StringStackArray() {
    stack = new String[MAX_STACK];
  }

  public void push(String s){
    if (stackPointer < MAX_STACK){
      stack[stackPointer] = s;
      stackPointer++;
    }
  }

  public String pop(){
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
