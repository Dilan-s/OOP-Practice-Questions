package com.company.ColouredPoints;

public class Point {

  private final double x;
  private final double y;
  private final double z;

  public Point(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distanceFrom(Point other) {
    double xDist = Math.abs(x - other.x);
    double yDist = Math.abs(y - other.y);
    double zDist = Math.abs(z - other.z);
    return Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2) + Math.pow(zDist, 2));
  }

  public double magnitude() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
  }

  public static Point getOrigin() {
    return new Point(0, 0, 0);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("(");
    sb.append(x);
    sb.append(", ");
    sb.append(y);
    sb.append(", ");
    sb.append(z);
    sb.append(")");
    return sb.toString();
  }


}
