package com.company.ComparingPeople;


public class ForenameComparison implements PersonComparator {

  @Override
  public int compareTo(Person p1, Person p2) {
    return p2.getForename().compareTo(p1.getForename());
  }

}
