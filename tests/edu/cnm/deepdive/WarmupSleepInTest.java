package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class WarmupSleepInTest {

  @ParameterizedTest(name = "[{index}] weekday = 0, vacation = 1, expected = 2")
  @CsvFileSource(resources = "sleep-in.csv")
  void sleepIn(boolean weekday, boolean vacation, boolean expected) {
    WarmupSleepIn warmupSleepIn = new WarmupSleepIn();
    boolean actual = warmupSleepIn.sleepIn(weekday, vacation);
    assertEquals(expected, actual);
  }

}