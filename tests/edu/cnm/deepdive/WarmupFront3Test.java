package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupFront3Test {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "front3.csv", numLinesToSkip = 1)
  void front3(String str, String expected) {
    WarmupFront3 warmupFront3 = new WarmupFront3();
    String actual = warmupFront3.front3(str);
    assertEquals(actual, expected);
  }
}