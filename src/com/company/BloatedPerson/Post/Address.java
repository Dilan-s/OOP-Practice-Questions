package com.company.BloatedPerson.Post;

import java.util.Objects;

public class Address {

  private final int houseNumber;
  private final String address1;
  private final String address2;
  private final String postCode;

  public Address(int houseNumber, String address1, String address2, String postCode) {
    this.houseNumber = houseNumber;
    this.address1 = address1;
    this.address2 = address2;
    this.postCode = postCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Address)) {
      return false;
    }
    Address address = (Address) o;
    return houseNumber == address.houseNumber &&
        Objects.equals(address1, address.address1) &&
        Objects.equals(address2, address.address2) &&
        Objects.equals(postCode, address.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseNumber, address1, address2, postCode);
  }

  @Override
  public String toString() {
    return houseNumber + " " + address1 + ", " + address2 + ", " + postCode;
  }
}


