package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupNotStringTest {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "not-string.csv", numLinesToSkip = 1)
  void notString(String str, String expected) {
    WarmupNotString warmupNotString = new WarmupNotString();
    String actual = warmupNotString.notString(str);
    assertEquals(actual, expected);
  }
}