package org.contourgara;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {

  @Test
  void _3の倍数の場合Fizzを返す() {
    // setup
    FizzBuzz sut = new FizzBuzz();
    String expected = "Fizz";

    // execute
    String actual = sut.checkFizzBuzz(6);

    // assert
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void _5の倍数の場合Buzzを返す() {
    // setup
    FizzBuzz sut = new FizzBuzz();
    String expected = "Buzz";

    // execute
    String actual = sut.checkFizzBuzz(5);

    // assert
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void _15の倍数の場合FizzBuzzを返す() {
    //setup
    FizzBuzz sut = new FizzBuzz();
    String expected = "FizzBuzz";

    //execute
    String actual = sut.checkFizzBuzz(15);

    //assert
    assertThat(actual).isEqualTo(expected);
  }
}
