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

class JankenUseCaseByJpTest {
    @Mock
    Console console;

    @InjectMocks
    JankenUseCaseByJp sut;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void プレイヤー1の手を設定できる() {
        // set up
        doReturn(new char[]{'グ', 'ー'}).when(console).readPassword(anyString());

        // execute
        JankenHand actual = sut.getPlayer1JankenHand();

        // assert
        JankenHand expected = JankenHand.ROCK;
        assertThat(actual).isEqualTo(expected);

        verify(console, times(1)).printf("プレイヤー 1 の手を入力してください。%s", System.lineSeparator());
    }

    @Nested
    class じゃんけんの結果を出力できる {
        @Test
        void プレイヤー1が勝ちの場合() {
            // execute
            sut.displayJankenResult(JankenResult.WIN);

            // assert
            verify(console, times(1)).printf("プレイヤー 1 の勝ち！%s", System.lineSeparator());
        }

        @Test
        void プレイヤー1が負けの場合() {
            // execute
            sut.displayJankenResult(JankenResult.LOSE);

            // assert
            verify(console, times(1)).printf("プレイヤー 2 の勝ち！%s", System.lineSeparator());
        }

        @Test
        void あいこの場合() {
            // execute
            sut.displayJankenResult(JankenResult.DRAW);

            // assert
            verify(console, times(1)).printf("あいこ！%s", System.lineSeparator());
        }
    }
}
