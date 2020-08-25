package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupStringETest {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "track-of-e.csv", numLinesToSkip = 1)
  void stringE(String str, boolean expected) {
    WarmupStringE warmupStringE = new WarmupStringE();
    boolean actual = warmupStringE.stringE(str);
    assertEquals(actual, expected);
  }
}