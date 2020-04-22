package com.company.GenericNumberManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberManipulation {

  private static <T extends Number> Set<T> readNumbers(int n, NumberParser<T> numberParser)
      throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Set<T> res = new HashSet<>();
    while (res.size() != n) {
      System.out.println("Please enter an " + numberParser.typeParsed() + ":");
      res.add(numberParser.parseNumber(reader.readLine()));
    }
    return res;
  }

  private static <T extends Number> T addNumbers(Set<T> s, NumberAdder<T> numberAdder) {
    return s.stream()
        .reduce(numberAdder::add)
        .orElse(numberAdder.zero());
  }

  public static void displayAsDoubles(Set<? extends Number> numbers) {
    System.out.print("[ ");
    Iterator<? extends Number> it = numbers.iterator();
    while (it.hasNext()) {
      System.out.print(it.next().doubleValue());
      if (it.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public static void displayAsInts(Set<? extends Number> numbers) {
    System.out.print("[ ");
    Iterator<? extends Number> it = numbers.iterator();
    while (it.hasNext()) {
      System.out.print(it.next().intValue());
      if (it.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.println(" ]");
  }

  public static void main(String[] args) {
    DoubleParser dp = new DoubleParser();
    IntegerParser ip = new IntegerParser();
    Set<Double> setDouble = null;
    Set<Integer> setInteger = null;
    try {
      setDouble = readNumbers(5, dp);
      System.out.println("Double done");
      setInteger = readNumbers(5, ip);
      System.out.println("Integer done");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    assert setDouble != null;
    System.out.println(setDouble.toString());
    assert setInteger != null;
    System.out.println(setInteger.toString());

    System.out.println("Sum of Doubles = " + addNumbers(setDouble, new DoubleAdder()));
    System.out.println("Sum of Integers = " + addNumbers(setInteger, new IntegerAdder()));

    displayAsDoubles(setInteger);
    displayAsInts(setDouble);
  }
}
