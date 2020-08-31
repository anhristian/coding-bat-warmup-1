package edu.cnm.deepdive;

public class FrontBack {

  public String frontBack(String str) {
    if (str.length() <= 1){
      return str;
    }
    String middleStr = str.substring(1, str.length() - 1);
    return str.charAt(str.length() -1) + middleStr + str.charAt(0);
  }


}
