package edu.cnm.deepdive;

public class WarmupDelDel {

  public String delDel(String str) {

    if(str.indexOf("del", 1) == 1){
      return str.replaceFirst("del", "");
    }
    return str;
  }
}
