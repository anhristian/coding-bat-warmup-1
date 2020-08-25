package edu.cnm.deepdive;

public class WarmupEndUp {
  public String endUp(String str) {

    if (str.length() > 3) {
      return (str.substring(0, str.length() - 3) +
          (str.substring((str.length() - 3)).toUpperCase()));
    } else{
      return str.toUpperCase();
    }

  }


}
