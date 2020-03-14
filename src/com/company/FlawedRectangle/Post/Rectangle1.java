package com.company.FlawedRectangle.Post;

public class Rectangle1 {

  private final int width;
  private final int height;
  private final int area;

  public Rectangle1(int width, int height) {
    this.width = width;
    this.height = height;
    this.area = width * height;
  }

  public int getWidth() {
    return width;
  }


  public int getHeight() {
    return height;
  }


  public int getArea() {
    return area;
  }
}