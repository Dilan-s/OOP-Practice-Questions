package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

  private String[] input;
  private BufferedReader br;
  private String line;
  private int counter = 0;
  private final int MAX = 100;

  public WordCount() throws IOException {
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
    int noLines = 0;
    int noWords = 0;
    int noCharacters = 0;
    StringBuilder res = new StringBuilder();
    for (String s : input) {
      if (s == null) {
        break;
      }
      String s1 = s.replaceAll("[^a-zA-Z ]", " ");
      noLines++;
      String[] tokens = s1.split("[\\s]+");

      for (String t : tokens) {
        if (!t.equals("")) {
          noCharacters += t.length();
          noWords++;
        }
      }
    }
    res.append("Lines: ");
    res.append(noLines);
    res.append('\n');
    res.append("Words: ");
    res.append(noWords);
    res.append('\n');
    res.append("Characters: ");
    res.append(noCharacters);
    res.append('\n');
    return res.toString();
  }
}
