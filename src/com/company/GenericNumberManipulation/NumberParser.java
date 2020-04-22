package com.company.GenericNumberManipulation;

public interface NumberParser<E> {

  E parseNumber(String s);

  String typeParsed();
}
