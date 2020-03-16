package com.company.BloatedPerson.Post;

public class BloatedPersonDemo {

  public static void main(String[] args) {
    Name name = new Name("Di Pa", "Sh");
    Date date = new Date(2, 03, 2001);
    Address address = new Address(2, "Ke Av", "Ha", "FAK PCD");
    Person p11 = new Person(name, date, address, "NiNo.");
    System.out.println(p11);
  }
}
