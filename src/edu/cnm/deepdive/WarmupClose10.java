package edu.cnm.deepdive;

public class WarmupClose10 {

  public int close10(int a, int b) {
    int number1 = Math.abs(a -10);
    int number2 = Math.abs(b-10);

    if (number1 == number2) {
      return 0;

    } else if (number1 > number2){
      return b;

    }else {
      return a;
    }
  }
}
