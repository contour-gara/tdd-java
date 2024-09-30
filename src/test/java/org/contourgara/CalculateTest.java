package org.contourgara;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    @Test
    void 配列から最大値を除く() {
        int[] testList = {1, 2, 3};
        int[] expected = {1, 2};
        Calculate sut = new Calculate();
        int[] actual = sut.excludeMaxValue(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列から最大値を除く2() {
        int[] testList = {1, 3, 5, 5};
        int[] expected = {1, 3};
        Calculate sut = new Calculate();
        int[] actual = sut.excludeMaxValue(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列から最小値を除く() {
        int[] testList = {1, 2, 3};
        int[] expected = {2, 3};
        Calculate sut = new Calculate();
        int[] actual = sut.excludeMinValue(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列から最小値を除く2() {
        int[] testList = {1, 1, 3, 5, 5};
        int[] expected = {3, 5, 5};
        Calculate sut = new Calculate();
        int[] actual = sut.excludeMinValue(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列から最大値と最小値を除く() {
        int[] testList = {1, 2, 3, 4, 5, 5};
        int[] expected = {2, 3, 4};
        Calculate sut = new Calculate();
        int[] actual = sut.excludeMaxMinValue(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列から最大値と最小値を除く2() {
        int[] testList = {1, 2, 3, 4, 5, 5, 6};
        int[] expected = {2, 3, 4, 5, 5};
        Calculate sut = new Calculate();
        int[] actual = sut.excludeMaxMinValue(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列の平均値を求める() {
        int[] testList = {1, 2, 3, 4, 5, 5, 6};
        double expected = (double) (1 + 2 + 3 + 4 + 5 + 5 + 6) / 7;
        Calculate sut = new Calculate();
        double actual = sut.getAverage(testList);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 配列から最大値と最小値を除いた値の平均値を求める() {
        int[] testList = {1, 2, 3, 4, 5, 5, 6};
        double expected = (double) (2 + 3 + 4 + 5 + 5) / 5;
        Calculate sut = new Calculate();
        double actual = sut.execute(testList);
        assertThat(actual).isEqualTo(expected);
    }
}