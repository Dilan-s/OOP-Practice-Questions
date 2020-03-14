package com.company;

public class CollatzConjecture {

  private int x;

  public CollatzConjecture(int x) {
    this.x = x;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    boolean b1 = true;
    while (b1) {
      result.append(x);
      if (x == 1) {
        return result.toString();
      } else {
        result.append(" ");
        if (x % 2 == 0) {
          this.x = (x / 2);
        } else {
          this.x = (3 * x + 1);
        }
      }
    }
    return result.toString();
  }

  public String toString1() {
    StringBuilder result = new StringBuilder();
    result.append(x);
    if (x == 1) {
      return result.toString();
    }
    result.append(" ");
    CollatzConjecture newX;
    if (x % 2 == 0) {
      newX = new CollatzConjecture(x / 2);
    } else {
      newX = new CollatzConjecture(3 * x + 1);
    }
    result.append(newX.toString());
    return result.toString();
  }

}
