package org.contourgara;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
