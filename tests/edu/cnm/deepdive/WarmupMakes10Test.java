package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupMakes10Test {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, expected = 2")
  @CsvFileSource(resources = "makes10.csv", numLinesToSkip = 1)
  void makes10(int a, int b, boolean expected) {
    WarmupMakes10 warmupMakes10 = new WarmupMakes10();
    boolean actual = warmupMakes10.makes10(a, b);
    assertEquals(actual, expected);
  }
}