package com.company.ComparingPeople;

public class Person {

  private String forename;
  private String surname;
  private String telephone;

  public Person(String forename, String surname, String telephone) {
    this.forename = forename.toLowerCase();
    this.surname = surname.toLowerCase();
    this.telephone = telephone.toLowerCase();
  }

  public String getForename() {
    return forename;
  }

  public String getSurname() {
    return surname;
  }

  public String getTelephone() {
    return telephone;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    String forenameUpper = forename.toUpperCase();
    String surnameUpper = surname.toUpperCase();
    sb.append(forenameUpper.toCharArray()[0]);
    sb.append(forename.substring(1));
    sb.append(" - ");
    sb.append(surnameUpper.toCharArray()[0]);
    sb.append(surname.substring(1));
    sb.append(" - ");
    sb.append(telephone);
    return sb.toString();
  }
}
