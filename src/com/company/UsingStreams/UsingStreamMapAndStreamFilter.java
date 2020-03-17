package com.company.UsingStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamMapAndStreamFilter {

  public static void main(String[] args) {
    final List<String> strings = Arrays.asList(
        "1astring", "2anotherstring", "ant", "eater", "-1nofirstdigit", "9anotherstring",
        "88only8getsrooted");

    final List<String> expectedReversed = Arrays.asList(
        "gnirtsa1", "gnirtsrehtona2", "tna", "retae", "tigidtsrifon1-", "gnirtsrehtona9",
        "detoorsteg8ylno88");

    final List<Double> expectedSqrtsOfFirstDigits = Arrays.asList(Math.sqrt(1), Math.sqrt(2),
        Math.sqrt(9), Math.sqrt(8));

    final List<String> reversed1 = reverseEachString(strings);
    final List<String> reversed2 = reverseEachStringMonolithic(strings);

    final List<Double> sqrtsOfFirstDigits1 = sqrtsOfFirstDigits(strings);
    final List<Double> sqrtsOfFirstDigits2 = sqrtsOfFirstDigitsMonolithic(strings);

    System.out.println("Two ways of reversing " + strings + " give " + reversed1 + " and "
        + reversed2);

    System.out.println("Two ways of taking the square roots of the first digits of any strings in "
        + strings + " that start with digits give " + sqrtsOfFirstDigits1 + " and "
        + sqrtsOfFirstDigits2);

    assert expectedReversed.equals(reversed1);
    assert expectedReversed.equals(reversed2);

    assert expectedSqrtsOfFirstDigits.equals(sqrtsOfFirstDigits1);
    assert expectedSqrtsOfFirstDigits.equals(sqrtsOfFirstDigits2);
  }

  public static List<String> reverseEachString(List<String> input){
    return input.stream()
        .map(StringBuilder::new)
        .map(StringBuilder::reverse)
        .map(StringBuilder::toString)
        .collect(Collectors.toList());
  }

  public static List<String> reverseEachStringMonolithic(List<String> input){
    return input.stream()
        .map(x -> new StringBuilder(x).reverse().toString())
        .collect(Collectors.toList());
  }

  public static List sqrtsOfFirstDigits(List<String> input){
    return input.stream()
        .filter(x -> x.length() > 0)
        .filter(x -> Character.isDigit(x.charAt(0)))
        .map(x -> Integer.parseInt(String.valueOf(x.charAt(0))))
        .map(Math::sqrt)
        .collect(Collectors.toList());
  }

  public static List sqrtsOfFirstDigitsMonolithic(List<String> input){
    return input.stream()
        .filter(x -> x.length() > 0 && Character.isDigit(x.charAt(0)))
        .map(x -> Math.sqrt(Integer.parseInt(String.valueOf(x.charAt(0)))))
        .collect(Collectors.toList());
  }
}
