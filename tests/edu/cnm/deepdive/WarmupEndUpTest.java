package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupEndUpTest {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "end-up.csv", numLinesToSkip = 1)
  void endUp(String str, String expected) {
    WarmupEndUp warmupEndUp = new WarmupEndUp();
    String actual = warmupEndUp.endUp(str);
    assertEquals(actual, expected);
  }
}