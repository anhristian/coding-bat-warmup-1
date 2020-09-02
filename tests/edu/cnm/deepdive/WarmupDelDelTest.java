package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupDelDelTest {

  @ParameterizedTest(name = "[{index}] str = 0")
  @CsvFileSource(resources = "del.csv", numLinesToSkip = 1)
  void delDel(String str, String expected) {

    WarmupDelDel warmupDelDel = new WarmupDelDel();
    String actual = warmupDelDel.delDel(str);
    assertEquals(actual,expected);
  }
}