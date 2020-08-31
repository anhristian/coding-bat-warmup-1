package edu.cnm.deepdive;

public class PosNeg {

  public boolean posNeg(int a, int b, boolean negative) {
    if (negative && a< 0 && b< 0) {
      return true;
    }else
      return !negative && ((a < 0 && b > 0) || (a > 0 && b < 0));
  }

}
