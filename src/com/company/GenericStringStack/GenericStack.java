package com.company.GenericStringStack;

public interface GenericStack<T> {

  void push(T s);

  T pop();

  boolean isEmpty();
}
