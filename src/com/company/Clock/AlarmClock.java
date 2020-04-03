package com.company.Clock;

public class AlarmClock extends Clock {

  private boolean alarmOn;
  private int secAlarmTime = -1;

  public AlarmClock(int secSinceMid) {
    super(secSinceMid);
    alarmOn = false;
  }

  public AlarmClock(int hours, int minutes, int seconds) {
    super(hours, minutes, seconds);
    alarmOn = false;
  }

  public void setAlarm(int secAlarmTime) {
    this.secAlarmTime = secAlarmTime;
  }

  public void setAlarm(int hours, int minutes, int seconds) {
    setAlarm(3600 * hours + 60 * minutes + seconds);
  }

  @Override
  public void tick() {
    super.tick();
    if (alarmOn) {
      assert secSinceMid != secAlarmTime;

      int oneMinuteAgo = secSinceMid - 60;
      if (oneMinuteAgo < 0) {
        oneMinuteAgo += 24 * 60 * 60;
      }

      if (oneMinuteAgo == secAlarmTime) {
        alarmOn = false;
      }
    } else if (secSinceMid == secAlarmTime) {
      alarmOn = true;
    }
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    if (alarmOn) {
      sb.append(" BLEEP!");
    }
    return sb.toString();
  }
}
