package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupIn3050Test {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, expected = 2")
  @CsvFileSource(resources = "in3050.csv", numLinesToSkip = 1)
  void in3050(int a, int b, boolean expected) {
    WarmupIn3050 warmupIn3050 = new WarmupIn3050();
    boolean actual = warmupIn3050.in3050(a, b);
    assertEquals(actual, expected);
  }
}