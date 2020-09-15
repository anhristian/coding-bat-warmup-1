package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupMax1020Test {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, expected = 2")
  @CsvFileSource(resources = "max1020.csv", numLinesToSkip = 1)
  void max1020(int a, int b, int expected) {
    WarmupMax1020 warmupMax1020 = new WarmupMax1020();
    int actual = warmupMax1020.max1020(a,b);
    assertEquals(actual,expected);
  }
}