package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FrontBackTest {

  @ParameterizedTest(name = "[{index}] str = 0, expected = 1")
  @CsvFileSource(resources = "front-back.csv", numLinesToSkip = 1)
  void frontBack(String str, String expected) {
    FrontBack frontBack = new FrontBack();
    String actual = frontBack.frontBack(str);
    assertEquals(actual, expected);
  }
}