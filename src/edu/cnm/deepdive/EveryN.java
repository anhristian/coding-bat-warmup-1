package edu.cnm.deepdive;

public class EveryN {

  public String everyNth(String str, int n) {
    StringBuilder strMade = new StringBuilder();
    for(int i = 0; i < str.length(); i+=n)
      strMade.append(str.charAt(i));

    return strMade.toString();
  }

}
