package com.company.ComparingPeople;


public class TelephoneNumberComparison implements PersonComparator {

  @Override
  public int compareTo(Person p1, Person p2) {
    return p2.getTelephone().compareTo(p1.getTelephone());
  }

}
