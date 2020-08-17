package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupDiff21Test {

  @ParameterizedTest(name = "[{index}] n = 0, expected = 1")
  @CsvFileSource(resources = "diff21.csv", numLinesToSkip = 1)
  void diff21(int n, int expected) {
    WarmupDiff21 warmupDiff21 = new WarmupDiff21();
    int actual = warmupDiff21.diff21(n);
    assertEquals(actual, expected);
  }
}