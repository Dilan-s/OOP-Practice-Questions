package com.company.ColouredPoints;

public enum Colour {

  RED("Red"),
  BLUE("Blue"),
  GREEN("Green");

  private final String colour;

  Colour(String colour){
    this.colour = colour;
  }

  @Override
  public String toString() {
    return colour;
  }
}
