package edu.cnm.deepdive;

public class WarmupFront22 {

  public String front22(String str) {
    if(str.length() < 3){
      return str + str + str;
    } else {
      String newStr = str.substring(0,2);
      return newStr + str +newStr;
    }
  }
}
