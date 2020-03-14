package com.company;


import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

  Random generator;
  int x;
  int val;
  boolean[] bs, finalAnswer;


  public RandomNumbers(int x) {
    generator = new Random();
    this.x = x;
    val = generator.nextInt(x);
    bs = new boolean[x];
    finalAnswer = new boolean[x];
    generatefinalAnswer();
  }

  private void getNextVal() {
    val = generator.nextInt(x);
  }

  private void generatefinalAnswer() {
    for (int i = 0; i < x; i++) {
      finalAnswer[i] = true;
    }
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("Generating random numbers:\n");
    int i = 0;
    while (!Arrays.equals(bs, finalAnswer)) {
      i++;
      result.append(val);
      bs[val] = true;
      if (Arrays.equals(bs, finalAnswer)) {
        result.append("\nI had to generate ");
        result.append(i);
        result.append(" random numbers between 0 and ");
        result.append(x);
        result.append(" to have produced all such numbers at least once.");
        return result.toString();
      }
      result.append(", ");
      getNextVal();
    }
  return result.toString();
  }
}
