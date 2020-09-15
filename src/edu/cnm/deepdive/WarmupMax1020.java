package edu.cnm.deepdive;

public class WarmupMax1020 {

  public int max1020(int a, int b) {
    if((a<10||a>20)&& (b<10 ||b>20) ){
      return 0;
    } else if((a>=10 && a<=20) && a> b) {
      return a;
    } else if((b>=10 && b<=20) && a< b) {
      return b;
    } else if(a>=10 && a<=20 && b > 20 || b<10) {
      return a;
    }else if(b>=10 && b<=20 &&  a > 20 || a< 10) {
      return b;
    }else{
      return 0;
    }
  }

}
