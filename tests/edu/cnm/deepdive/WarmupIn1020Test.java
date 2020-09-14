package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupIn1020Test {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, c = 2")
  @CsvFileSource(resources = "in1020.csv", numLinesToSkip = 1)
  void in1020(int a, int b, boolean expected) {
    WarmupIn1020 warmupIn1020 = new WarmupIn1020();
    Boolean actual = warmupIn1020.in1020(a,b);
    assertEquals(actual, expected);
  }
}