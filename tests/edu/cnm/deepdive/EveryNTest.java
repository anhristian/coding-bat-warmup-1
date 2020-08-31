package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class EveryNTest {

  @ParameterizedTest(name = "[{index}] str = 0, n = 1, expected = 2")
  @CsvFileSource(resources = "every-n.csv", numLinesToSkip = 1)
  void everyNth(String str, int n, String expected) {
    EveryN everyN = new EveryN();
    String actual = everyN.everyNth(str,n);
    assertEquals(actual, expected);
  }
}