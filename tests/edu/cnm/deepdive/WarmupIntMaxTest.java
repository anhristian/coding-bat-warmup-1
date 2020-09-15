package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupIntMaxTest {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, c = 2, expected = 3")
  @CsvFileSource(resources = "int-max.csv", numLinesToSkip = 1)
  void intMax(int a, int b, int c, int expected) {
    WarmupIntMax warmupIntMax = new WarmupIntMax();
    int actual = warmupIntMax.intMax(a,b,c);
    assertEquals(actual,expected);
  }
}