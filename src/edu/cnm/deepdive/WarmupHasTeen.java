package edu.cnm.deepdive;

public class WarmupHasTeen {

  public boolean hasTeen(int a, int b, int c) {
    boolean result = false;
    if ((a >= 13 && a <= 19) || (b >= 13 && b<= 19) || (c >= 13 && c <= 19)) {
      return true;
    }
    return result;
  }

}
