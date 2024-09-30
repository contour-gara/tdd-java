package org.contourgara;

import java.util.Arrays;

public class Calculate {
    public double execute(int[] args) {
        int[] excludeMaxMinValueArray = excludeMaxMinValue(args);
        return getAverage(excludeMaxMinValueArray);
    }

    public int[] excludeMaxMinValue(int[] args) {
        return excludeMaxValue(excludeMinValue(args));
    }

    public int[] excludeMaxValue(int[] args) {
        int maxValue = Arrays.stream(args).max().getAsInt();
        return Arrays.stream(args).filter(value -> value != maxValue).toArray();
    }

    public int[] excludeMinValue(int[] args) {
        int minValue = Arrays.stream(args).min().getAsInt();
        return Arrays.stream(args).filter(value -> value != minValue).toArray();
    }

    public double getAverage(int[] args) {
        return Arrays.stream(args).average().getAsDouble();
    }
}
