package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PigLatin {

  private String[] input;
  private BufferedReader br;
  private String line;
  private final int MAX = 100;
  private int counter = 0;

  public PigLatin() throws IOException {
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
    for (String s : input) {
      if (s == null) {
        break;
      }
      String[] tokens = s.split("[\\s]+");
      for (String t : tokens) {
        res.append(translate(t));
        res.append(' ');
      }
      res.append('\n');
    }
    return res.toString();
  }

  private static String translate(String word) {
    assert !word.equals("");
    assert word != null;
    int first = 0;
    int last = word.length() - 1;
    char finalLetter = word.charAt(last);
    char firstLetter = word.charAt(first);
    boolean capitalStart = Character.isUpperCase(firstLetter);
    boolean punctuationEnd = isPunctuation(finalLetter);
    boolean vowelStart = isVowel(firstLetter);
    String newWord;
    if (vowelStart && punctuationEnd) {
      newWord = word.substring(first, last) + "way";
    } else if (vowelStart) {
      newWord = word + "way";
    } else if (Character.isAlphabetic(firstLetter) && punctuationEnd) {
      newWord = word.substring(1, last) + firstLetter + "ay";
    } else if (Character.isAlphabetic(firstLetter)) {
      newWord = word.substring(1) + firstLetter + "ay";
    } else {
      newWord = word;
    }
    newWord = newWord.toLowerCase();
    if (punctuationEnd) {
      if (Character.isAlphabetic(firstLetter)) {
        newWord = newWord + finalLetter;
      }
    }
    if (capitalStart) {
      newWord = newWord.substring(0, 1).toUpperCase() + newWord.substring(1);
    }
    return newWord;

  }

  private static boolean isPunctuation(char c) {
    char[] punctuations = ".,;:?!\"\'()".toCharArray();
    for (char ch : punctuations) {
      if (c == ch) {
        return true;
      }
    }
    return false;
  }

  private static boolean isVowel(char c) {
    char[] vowels = "aeiouAEIOU".toCharArray();
    for (char ch : vowels) {
      if (c == ch) {
        return true;
      }
    }
    return false;
  }
}