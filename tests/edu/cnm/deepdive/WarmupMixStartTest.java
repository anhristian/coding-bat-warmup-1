package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupMixStartTest {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "mix-start.csv", numLinesToSkip = 1)
  void mixStart(String str, boolean expected) {
    WarmupMixStart warmupMixStart = new WarmupMixStart();
    boolean actual = warmupMixStart.mixStart(str);
    assertEquals(actual, expected);

  }
}