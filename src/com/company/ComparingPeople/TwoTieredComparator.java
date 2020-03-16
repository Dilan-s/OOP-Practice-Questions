package com.company.ComparingPeople;

public class TwoTieredComparator implements PersonComparator {

  private PersonComparator first;
  private PersonComparator second;

  public TwoTieredComparator(PersonComparator first, PersonComparator second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public int compareTo(Person p1, Person p2) {
    int result = first.compareTo(p1, p2);
    if (result != 0){
      return result;
    }
    result = second.compareTo(p1, p2);
    return result;
  }
}
