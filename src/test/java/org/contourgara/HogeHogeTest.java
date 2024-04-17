package org.contourgara;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HogeHogeTest {
  @Test
  void test() {
    // setup
    HogeHoge sut = new HogeHoge();

    // execute
    String actual = sut.hello();

    // assert
    String expected = "HogeHoge";
    assertThat(actual).isEqualTo(expected);
  }
}
