package edu.cnm.deepdive;

public class LastDigit {
  public boolean lastDigit(int a, int b) {
    if ((a % 10) == (b % 10)){
      return true;
    }
    return false;
  }

}
