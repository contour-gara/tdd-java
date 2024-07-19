package org.contourgara;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {


  @ParameterizedTest
  @CsvSource(textBlock = """
          1, 1
          2, 2
          """)
  void number_to_string_number(int input , String expected) {
    // setup
    FizzBuzz sut = new FizzBuzz();

    // execute
    String actual = sut.fizzBuzz(input);

    // assert
    assertThat(actual).isEqualTo(expected);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
          3, fizz
          6, fizz
          12, fizz
          """)
  void three_to_string_fizz(int input , String expected) {
    // setup
    FizzBuzz sut = new FizzBuzz();

    // execute
    String actual = sut.fizzBuzz(input);

    // assert
    assertThat(actual).isEqualTo(expected);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
          5, buzz
          10, buzz
          20, buzz
          """)
  void five_to_string_buzz(int input , String expected) {
    // setup
    FizzBuzz sut = new FizzBuzz();

    // execute
    String actual = sut.fizzBuzz(input);

    // assert
    assertThat(actual).isEqualTo(expected);
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
          15, fizzbuzz
          30, fizzbuzz
          """)
  void fifteen_to_string_buzz(int input , String expected) {
    // setup
    FizzBuzz sut = new FizzBuzz();

    // execute
    String actual = sut.fizzBuzz(input);

    // assert
    assertThat(actual).isEqualTo(expected);
  }
}
