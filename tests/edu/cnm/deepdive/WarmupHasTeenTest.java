package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupHasTeenTest {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, c = 2, expected = 3")
  @CsvFileSource(resources = "has-teen.csv", numLinesToSkip = 1)
  void hasTeen(int a, int b, int c, boolean expected) {
    WarmupHasTeen warmupHasTeen = new WarmupHasTeen();
    boolean actual = warmupHasTeen.hasTeen(a,b,c);
    assertEquals(actual, expected);

  }
}