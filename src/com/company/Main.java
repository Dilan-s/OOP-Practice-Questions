package com.company;

import com.company.BattlingFighters.LuckyFighter;
import com.company.BattlingFighters.LuckyGameEngine;
import com.company.BattlingFighters.Strategy;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

//    int integerVersionOfFirstArgument = Integer.parseInt(args[0]);
//    CollatzConjecture p1 = new CollatzConjecture(integerVersionOfFirstArgument);
//    System.out.println(p1);
//
//    PerfectPalindromes p2 = new PerfectPalindromes();
//    System.out.println(p2);
//
//    LotteryNumbers p3 = new LotteryNumbers();
//    System.out.println(p3);
//
//    RandomNumbers p4 = new RandomNumbers(integerVersionOfFirstArgument);
//    System.out.println(p4);
//
//    ReverseOrder p5 = new ReverseOrder();
//    System.out.println(p5);
//
//    PigLatin p6 = new PigLatin();
//    System.out.println(p6);
//
//    WordCount p7 = new WordCount();
//    System.out.println(p7);

//    Fighter f1 = new Fighter("Joe", "Human Warrior", 16, 12);
//    Fighter f2 = new Fighter("Alex", "Elf Lord", 18, 6);
//    GameEngine p8 = new GameEngine(f1, f2);
//    p8.simulateBattle();

    LuckyFighter f1 = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, Strategy.AGGRESSIVE);
    LuckyFighter f2 = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.DEFENCIVE);
    LuckyGameEngine p8 = new LuckyGameEngine(f1, f2);
    p8.simulateBattle();
  }
}

