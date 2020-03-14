package com.company.BloatedPerson.Post;

public class Person {

  private final Name name;

  private final Date doB;

  private Address address;

  private final String nationalInsuranceNumber;

  public Person(Name name, Date doB, Address address, String nationalInsuranceNumber) {
    this.name = name;
    this.doB = doB;
    this.address = address;
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public String toString() {
    return "Name: " + name + "\n"
        + "DOB: " + doB + "\n"
        + "Address: " + address + "\n"
        + "NI: " + nationalInsuranceNumber;

  }

}