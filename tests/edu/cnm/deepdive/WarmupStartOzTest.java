package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupStartOzTest {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "start-oz.csv", numLinesToSkip = 1)
  void startOz(String str, String expected) {
    WarmupStartOz warmupStartOz = new WarmupStartOz();
    String actual = warmupStartOz.startOz(str);
    assertEquals(actual, expected);
  }
}