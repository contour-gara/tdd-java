package org.contourgara;

import java.util.Collections;
import java.util.List;

public class AverageHandler {
  public double average(List<Integer> numbers) {
    if (numbers.size() < 3) {
      throw new IllegalArgumentException("引数は３つ以上必要です");
    }

    Integer max = Collections.max(numbers);
    Integer min = Collections.min(numbers);

    double result = numbers.stream()
            .mapToInt(Integer::intValue)
            .filter(e -> e != max)
            .filter(e -> e != min)
            .average()
            .orElse(0.0);

    return result;
  }
}
