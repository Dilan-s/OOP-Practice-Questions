package com.company.ComparingPeople;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ComparingPeopleDemo {

  public static void main(String[] args) {

    final Person DI = new Person("Di","Sh", "07484");
    final Person SH = new Person("Sh","Ch", "07435");
    final Person PA = new Person("Pa","Pa", "05447");
    final Person TR = new Person("Tr","Ra", "04234");

    Set<Person> set = new HashSet<>();
    set.add(DI);
    set.add(SH);
    set.add(PA);
    set.add(TR);

    ForenameComparison f = new ForenameComparison();
    SurnameComparison s = new SurnameComparison();
    TelephoneNumberComparison t = new TelephoneNumberComparison();

    System.out.println(findMin(set, f));
    System.out.println(findMin(set, s));
    System.out.println(findMin(set, t));

    TwoTieredComparator st = new TwoTieredComparator(s, t);
    TwoTieredComparator fst = new TwoTieredComparator(f, st);

    System.out.println(findMin(set, fst));

  }

  public static Person findMin(Set<Person> people, PersonComparator comparator){
    Iterator<Person> personIterator = people.iterator();
    Person person = personIterator.next();
    while (personIterator.hasNext()){
      Person next = personIterator.next();
      if (comparator.compareTo(person, next) < 0){
        person = next;
      }
    }
    return person;
  }
}
