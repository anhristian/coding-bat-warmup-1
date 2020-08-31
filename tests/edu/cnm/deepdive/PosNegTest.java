package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PosNegTest {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, negative = 2, expected = 3")
  @CsvFileSource(resources = "pos-neg.csv", numLinesToSkip = 1)
  void posNeg(int a, int b, boolean negative, boolean expected) {
    PosNeg posNeg = new PosNeg();
    boolean actual = posNeg.posNeg(a, b, negative);
    assertEquals(actual, expected);
  }
}