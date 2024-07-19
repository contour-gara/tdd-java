package org.contourgara;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {

  @ParameterizedTest
  @CsvSource(delimiterString = "|", textBlock = """
      1 | 1
      3 | Fizz
      5 | Buzz
      6 | Fizz
      10 | Buzz
      11 | 11
      15 | FizzBuzz
      30 | FizzBuzz
      0 | 0
      300000 | FizzBuzz
      """)
  void test (
      int inputNumber, String expected
  ) {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String actual = fizzBuzz.execute(inputNumber);

    assertThat(actual).isEqualTo(expected);
  }

}