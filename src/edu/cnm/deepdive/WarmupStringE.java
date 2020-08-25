package edu.cnm.deepdive;

public class WarmupStringE {

  public boolean stringE(String str) {
    int trackOfE = 0;

    for(int i = 0; i< str.length(); i++) {

      if (str.charAt(i) == 'e')
        trackOfE++;
    }
    return (trackOfE >= 1 && trackOfE <=3);
  }


}
