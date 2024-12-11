package org.contourgara.application;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.Console;
import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class JankenUseCaseByEnTest {
    @Mock
    Console console;

    @InjectMocks
    JankenUseCaseByEn sut;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void プレイヤー1の手を設定できる() {
        // set up
        doReturn(new char[]{'R', 'o', 'c', 'k'}).when(console).readPassword("Select a hand from the list. [Rock, Paper, Scissors]: ");

        // execute
        JankenHand actual = sut.getPlayer1JankenHand();

        // assert
        JankenHand expected = JankenHand.ROCK;
        assertThat(actual).isEqualTo(expected);

        verify(console, times(1)).printf("Enter hand of player1.%s", System.lineSeparator());
    }

    @Nested
    class じゃんけんの結果を出力できる {
        @Test
        void プレイヤー1が勝ちの場合() {
            // execute
            sut.displayJankenResult(JankenResult.WIN);

            // assert
            verify(console, times(1)).printf("Player 1 wins!%s", System.lineSeparator());
        }

        @Test
        void プレイヤー1が負けの場合() {
            // execute
            sut.displayJankenResult(JankenResult.LOSE);

            // assert
            verify(console, times(1)).printf("Player 2 wins!%s", System.lineSeparator());
        }

        @Test
        void あいこの場合() {
            // execute
            sut.displayJankenResult(JankenResult.DRAW);

            // assert
            verify(console, times(1)).printf("Draw!%s", System.lineSeparator());
        }
    }
}
