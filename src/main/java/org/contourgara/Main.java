package org.contourgara;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <=Integer.parseInt(args[0]); i++) {
            System.out.println(new FizzBuzz().fizzBuzz(i));
        }
    }
}
