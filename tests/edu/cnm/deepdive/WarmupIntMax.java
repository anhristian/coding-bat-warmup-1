package edu.cnm.deepdive;

public class WarmupIntMax {

  public int intMax(int a, int b, int c) {
    if(a>b && a>c) {
      return a;
    } if (b > a && b > c){
      return b;
    } else {
      return c;
    }
  }
}
