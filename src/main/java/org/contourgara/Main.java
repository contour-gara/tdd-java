package org.contourgara;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    System.out.print("数字を入力してね：");
    Scanner scanner = new Scanner(System.in);
    try {
      int scanNumber = Integer.parseInt(scanner.nextLine());
      for (int i = 0; i <= scanNumber; i++) {
        try {
          System.out.println(fizzBuzz.execute(i));
        } catch (Exception e) {
          System.err.println("入力値が正しくありません");
        }
      }
    } catch (NumberFormatException e) {
      System.out.print("数字を入力してね");
    }
  }
}
