package com.company.Clock;

public class ClockDemo {

  public static void main(String[] args) throws InterruptedException {
    Clock clock1 = new Clock(0);
    Clock clock2 = new Clock(23, 59, 53);
    int i = 0;
    while (i < 10){
      System.out.println("Clock 1 shows: " + clock1 + ". Clock 2 shows: " + clock2);
      clock1.tick();
      clock2.tick();
      Thread.sleep(1000);
      i++;
    }

    AlarmClock alarmClock1 = new AlarmClock(0);
    AlarmClock alarmClock2 = new AlarmClock(23, 59, 53);
    alarmClock1.setAlarm(15);
    alarmClock2.setAlarm(00,00,58); //NOT WORKING
    i = 0;
    while (i < 100){
      System.out.println("Clock 1 shows: " + alarmClock1 + ". Clock 2 shows: " + alarmClock2);
      alarmClock1.tick();
      alarmClock2.tick();
      Thread.sleep(1000);
      i++;
    }
  }

}
