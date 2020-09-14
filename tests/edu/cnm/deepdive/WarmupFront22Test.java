package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupFront22Test {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "front22.csv", numLinesToSkip = 1)
  void front22(String str, String expected) {
    WarmupFront22 warmupFront22 = new WarmupFront22();
    String actual = warmupFront22.front22(str);
    assertEquals(actual, expected);
  }
}