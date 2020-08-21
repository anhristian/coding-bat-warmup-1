package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupClose10Test {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, expected = 2")
  @CsvFileSource(resources = "close-10.csv", numLinesToSkip = 1)
  void close10(int a, int b, int expected) {
    WarmupClose10 warmupClose10 = new WarmupClose10();
   int actual = warmupClose10.close10(a, b);
   assertEquals(actual, expected);
  }
}