package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseOrder {

  private String[] input;
  private BufferedReader br;
  private String line;
  private int counter = 0;
  private final int MAX = 100;

  public ReverseOrder() throws IOException {
    this.input = new String[MAX];
    this.br = new BufferedReader(new InputStreamReader(System.in));
    this.line = br.readLine();
  }

  private void getNextLine() throws IOException {
    line = br.readLine();
  }

  public String toString() {
    while (line != null && counter < MAX && !line.equals("")) {
      input[counter] = line;
      counter++;
      try {
        getNextLine();
      } catch (IOException e) {
        break;
      }
    }
    StringBuilder res = new StringBuilder();
    for (int i = counter - 1; i >= 0; i--) {
      res.append(input[i]);
      res.append('\n');
    }

    return res.toString();
  }

}
