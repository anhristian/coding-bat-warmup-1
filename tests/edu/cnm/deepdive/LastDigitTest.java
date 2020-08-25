package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class LastDigitTest {

  @ParameterizedTest(name = "[{index}] a = 0, b = 1, expected = 2")
  @CsvFileSource(resources = "last-digit.csv", numLinesToSkip = 1)
  void lastDigit(int a, int b, boolean expected) {
    LastDigit lastDigit = new LastDigit();
    boolean actual = lastDigit.lastDigit(a, b);
    assertEquals(actual, expected);
  }
}