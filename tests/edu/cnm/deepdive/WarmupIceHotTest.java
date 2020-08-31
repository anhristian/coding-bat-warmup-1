package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupIceHotTest {

  @ParameterizedTest(name = "[{index}] temp1 = 0, temp2 = 1, expected = 2 ")
  @CsvFileSource(resources = "ice-hot.csv", numLinesToSkip = 1)
  void icyHot(int temp1, int temp2, boolean expected) {
    WarmupIceHot warmupIceHot = new WarmupIceHot();
    boolean actual = warmupIceHot.icyHot(temp1, temp2);
    assertEquals(actual, expected);
  }
}