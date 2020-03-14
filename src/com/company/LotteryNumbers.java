package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryNumbers {

  private Random generator;
  private int x;
  private int MAX_VALUE = 49;
  private Set<Integer> nums;

  public LotteryNumbers() {
    nums = new HashSet<>();
    generator = new Random();
    x = generator.nextInt(49) + 1;
  }

  private void getNextX(){
    x = generator.nextInt(49) + 1;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    int counter = 1;
    while (nums.size() != 6) {
      if (nums.add(x)) {
        result.append("Number ");
        result.append(counter);
        result.append(": ");
        result.append(x);
        result.append('\n');
        counter++;
      }
      getNextX();
    }
    while (nums.size() != 7) {
      if (nums.add(x)) {
        result.append("Bonus Number: ");
        result.append(x);
        counter++;
      } else {
        getNextX();
      }
    }
    return result.toString();
  }

}
