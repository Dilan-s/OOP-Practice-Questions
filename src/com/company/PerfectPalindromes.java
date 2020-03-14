package com.company;

public class PerfectPalindromes {

  private final int MAX_BOUND = 1500;

  public PerfectPalindromes() {

  }

  private static boolean checkPalindrome(String n) {
    for (int i = 0; i < n.length(); i++) {
      if (!(n.charAt(i) == n.charAt(n.length() - 1 - i))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= MAX_BOUND; i++) {
      String str = Integer.toString(i * i * i);
      if (checkPalindrome(str)) {
        result.append(i);
        result.append(" cubed is ");
        result.append(str);
        result.append('\n');
      }
    }
    return result.toString();
  }

}
