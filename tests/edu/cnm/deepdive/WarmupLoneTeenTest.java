package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupLoneTeenTest {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, expected = 2")
  @CsvFileSource(resources = "lone-teen.csv", numLinesToSkip = 1)
  void loneTeen(int a, int b, boolean expected) {
    WarmupLoneTeen warmupLoneTeen = new WarmupLoneTeen();
    boolean actual = warmupLoneTeen.loneTeen(a,b);
    assertEquals(actual, expected);
  }
}