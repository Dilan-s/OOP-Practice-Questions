package com.company;

//import java.io.IOException;

import com.company.BloatedPerson.Post.Address;
import com.company.BloatedPerson.Post.Date;
import com.company.BloatedPerson.Post.Name;
import com.company.BloatedPerson.Post.Person;

public class Main {

  public static void main(String[] args) {

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

//    LuckyFighter f1 = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12, Strategy.AGGRESSIVE);
//    LuckyFighter f2 = new LuckyFighter("Alex", "Elf Lord", 18, 6, 11, Strategy.DEFENCIVE);
//    LuckyGameEngine p8 = new LuckyGameEngine(f1, f2);
//    p8.simulateBattle();

//    /*p9*/
//    Artist queen = new Artist("Queen", Genre.ROCK);
//    queen.addRecord("A Night At the Opera");
//    queen.addRecord("Hot Space", Genre.POP);
//    queen.addRecord("A Day at the Races", Genre.ROCK);
//    queen.addRecord("Innuendo", Genre.ROCK);
//    System.out.println("All records by " + queen.getName() + ":");
//    queen.showCatalogue();
//    System.out.println("");
//    System.out.println("All " + Genre.ROCK + " records by " + queen.getName() + ":");
//    queen.showGenre(Genre.ROCK);

//    DrawingEngineDemo p10 = new DrawingEngineDemo();
//    DrawingEngineDemo.main(args);

    Name name = new Name("Dilan Pankaj", "Sheth");
    Date date = new Date(26, 03, 2001);
    Address address = new Address(201, "Kenmore Avenue", "Harrow", "HA3 8PB");
    Person p11 = new Person(name, date, address, "NiNo.");
    System.out.println(p11);
  }
}

