package org.contourgara;

public class FizzBuzz {

  public String execute(int inputNumber) {
    if (inputNumber == 0) return "0";
    if (inputNumber % 15 == 0) return "FizzBuzz";
    if (inputNumber % 3 == 0) return "Fizz";
    if (inputNumber % 5 == 0) return "Buzz";
    return String.format("%s", inputNumber);
  }


}
