package edu.cnm.deepdive;

public class WarmupSleepIn {

  public boolean sleepIn(boolean weekday, boolean vacation) {
    boolean sleepIn = true;
    if (sleepIn != weekday || sleepIn == vacation) {
      return true;
    }
    return false;
  }

}
