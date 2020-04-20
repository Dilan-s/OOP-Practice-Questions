package com.company.GenericIntSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenericIntSetDemo {

  public static <T> GenericSet<T> readIntegers(int numIntegers, InputStreamReader inputStreamReader)
      throws IOException {

    GenericSet<T> result = (numIntegers > 10 ? new GenericMemoryEfficientSet<T>() : new GenericSpeedEfficientSet<T>());

    BufferedReader br = new BufferedReader(inputStreamReader);

    for (int i = 0; i < numIntegers; i++) {
      System.out.println("Please enter an int:");
      result.add((T) (br.readLine()));
    }

    return result;
  }

  private static <T> GenericSet<T> readIntegers(int numIntegers) throws IOException {
    return readIntegers(numIntegers, new InputStreamReader(System.in));
  }

  public static void main(String[] args) {
    GenericSet<Integer> integers = null;
    try {
      integers = readIntegers(Integer.parseInt(args[0]));
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    assert integers != null;
    System.out.println("Set is: " + integers.getClass());

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("Enter an int, to be tested for membership:");
      String line = null;
      try {
        line = br.readLine();
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
      if (line == null || line.equals("")) {
        System.out.println("Goodbye!");
        break;
      }
      System.out.println("Set contains " + Integer.valueOf(line) + ": "
          + integers.contains(Integer.parseInt(line)));
    }
  }
}
