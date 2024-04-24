package org.contourgara;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {
  @Nested
  class _3の倍数の場合 {
    @Test
    void _3の時Fizzが返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(3);

      // assert
      String expected = "Fizz";
      assertThat(actual).isEqualTo(expected);
    }

    @Test
    void _6の時Fizzが返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(6);

      // assert
      String expected = "Fizz";
      assertThat(actual).isEqualTo(expected);
    }
  }

  @Nested
  class _5の倍数の場合 {
    @Test
    void _5の時にBuzzが返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(5);

      // assert
      String expected = "Buzz";
      assertThat(actual).isEqualTo(expected);
    }

    @Test
    void _10の時にBuzzが返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(10);

      // assert
      String expected = "Buzz";
      assertThat(actual).isEqualTo(expected);
    }
  }

  @Nested
  class _15の倍数の場合 {
    @Test
    void _15の時にFizzBuzzが返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(15);

      // assert
      String expected = "FizzBuzz";
      assertThat(actual).isEqualTo(expected);
    }

    @Test
    void _30の時にFizzBuzzが返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(30);

      // assert
      String expected = "FizzBuzz";
      assertThat(actual).isEqualTo(expected);
    }
  }

  @Nested
  class _3の倍数でも5の倍数でも15の倍数でもない場合 {
    @Test
    void _1の時に文字列1が返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(1);

      // assert
      String expected = "1";
      assertThat(actual).isEqualTo(expected);
    }

    @Test
    void _2の時に文字列2が返る() {
      // setup
      FizzBuzz sut = new FizzBuzz();

      // execute
      String actual = sut.fizzBuzz(2);

      // assert
      String expected = "2";
      assertThat(actual).isEqualTo(expected);
    }
  }
}
