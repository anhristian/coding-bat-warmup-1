package edu.cnm.deepdive;

public class WarmupFront3 {

  public String front3(String str) {
    String newStr;
    if(str.length() < 3) {
      return str + str + str;
    }else{
      newStr = str.substring(0,3);
    }
    return newStr + newStr + newStr;
  }
}
