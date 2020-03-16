package com.company.ComparingPeople;


public class SurnameComparison implements PersonComparator {

  @Override
  public int compareTo(Person p1, Person p2) {
    return p2.getSurname().compareTo(p1.getSurname());
  }

}
