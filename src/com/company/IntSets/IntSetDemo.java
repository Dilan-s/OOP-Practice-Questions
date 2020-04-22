package com.company.IntSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntSetDemo {

  public static IntSet readIntegers(int numIntegers, InputStreamReader inputStreamReader)
      throws IOException {

    IntSet result = (numIntegers > 10 ? new MemoryEfficientIntSet() : new SpeedEfficientIntSet());

    BufferedReader br = new BufferedReader(inputStreamReader);

    for (int i = 0; i < numIntegers; i++) {
      System.out.println("Please enter an int:");
      result.add(Integer.parseInt(br.readLine()));
    }

    return result;
  }

  private static IntSet readIntegers(int numIntegers) throws IOException {
    return readIntegers(numIntegers, new InputStreamReader(System.in));
  }

  public static void main(String[] args) {
    IntSet integers = null;
    try {
      integers = readIntegers(Integer.parseInt(args[0]));
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    assert integers != null;
    System.out.println("Set is: " + integers.getClass());
    System.out.println(integers);

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
