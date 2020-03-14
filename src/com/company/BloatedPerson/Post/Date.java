package com.company.BloatedPerson.Post;

public class Date {

  private int dayOfBirth;
  private int monthOfBirth;
  private int yearOfBirth;

  public Date(int dayOfBirth, int monthOfBirth, int yearOfBirth) {
    this.dayOfBirth = dayOfBirth;
    this.monthOfBirth = monthOfBirth;
    this.yearOfBirth = yearOfBirth;
  }

  public boolean isDateOfBirthValid() {
    if (yearOfBirth < 0) {
      return false;
    }
    if (monthOfBirth < 1 || monthOfBirth > 12) {
      return false;
    }

    if (dayOfBirth < 1) {
      return false;
    }

    switch (monthOfBirth) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        if (dayOfBirth > 31) {
          return false;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if (dayOfBirth > 30) {
          return false;
        }
        break;
      default:
        if (dayOfBirth > (isLeapYear() ? 29 : 28)) {
          return false;
        }
    }
    return true;
  }

  private boolean isLeapYear() {
    return (yearOfBirth % 4 == 0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(dayOfBirth);
    sb.append('/');
    sb.append(monthOfBirth);
    sb.append('/');
    sb.append(yearOfBirth);
    return sb.toString();
  }
}
