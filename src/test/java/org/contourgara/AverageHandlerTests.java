package org.contourgara;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AverageHandlerTests {
    @Test
    void averageTest_success() {
        AverageHandler sut = new AverageHandler();

        double actual = sut.average(List.of(1, 2, 3));

        double expected = 2.0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void averageTest_success_5Input() {
        AverageHandler sut = new AverageHandler();

        double actual = sut.average(List.of(16, 15, 10, 23, 30));

        double expected = 18.0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void averageTest_failed() {
        AverageHandler sut = new AverageHandler();

        assertThatThrownBy(
                () -> sut.average(List.of(1, 5))
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("引数は３つ以上必要です");
    }

//    @Test
//    void averageTest_failed_sameInput() {
//        AverageHandler sut = new AverageHandler();
//
//        assertThatThrownBy(
//                () -> sut.average(List.of(1, 1, 1, 1))
//        ).isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("");
//    }
}
