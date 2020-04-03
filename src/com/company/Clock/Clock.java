package com.company.Clock;

public class Clock {

  protected int secSinceMid;
  private int mode;

  public Clock(int secSinceMid) {
    mode = 0;
    this.secSinceMid = secSinceMid;
  }

  public Clock(int hours, int minutes, int seconds) {
    this(3600 * hours + 60 * minutes + seconds);
    mode = 1;
  }


  private static boolean timeCheck(int hours, int minutes, int seconds) {
    return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) &&
           (seconds >= 0 && seconds < 60);
  }

  public void tick(){
    secSinceMid++;
  }

  @Override
  public String toString() {
    int totalHours = secSinceMid / 3600;
    int minutes = (secSinceMid - totalHours * 3600) / 60;
    int seconds = secSinceMid - totalHours * 3600 - minutes * 60;
    int hours = totalHours % 24;
    final StringBuilder sb = new StringBuilder();
    if (mode == 1){
      sb.append(padding(hours));
      sb.append(":");
      sb.append(padding(minutes));
      sb.append(":");
      sb.append(padding(seconds));
    } else if (mode == 0){
      sb.append(secSinceMid);
      sb.append(" seconds since midnight");
    }
    return sb.toString();
  }

  private static String padding(int x){
    final StringBuilder sb = new StringBuilder();
    if (x<10){
      sb.append("0");
    }
    sb.append(x);
    return sb.toString();
  }
}
