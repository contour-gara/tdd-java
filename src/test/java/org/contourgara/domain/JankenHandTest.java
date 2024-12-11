package org.contourgara.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JankenHandTest {
    @Nested
    class グーは {
        @Test
        void グーとあいこ() {
            // execute
            JankenResult actual = JankenHand.ROCK.executeJanken(JankenHand.ROCK);

            // assert
            JankenResult expected = JankenResult.DRAW;
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void パーに負ける() {
            // execute
            JankenResult actual = JankenHand.ROCK.executeJanken(JankenHand.PAPER);

            // assert
            JankenResult expected = JankenResult.LOSE;
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void チョキに勝つ() {
            // execute
            JankenResult actual = JankenHand.ROCK.executeJanken(JankenHand.SCISSORS);

            // assert
            JankenResult expected = JankenResult.WIN;
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Nested
    class パーは {
        @Test
        void グーに勝つ() {
            // execute
            JankenResult actual = JankenHand.PAPER.executeJanken(JankenHand.ROCK);

            // assert
            JankenResult expected = JankenResult.WIN;
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void パーとあいこ() {
            // execute
            JankenResult actual = JankenHand.PAPER.executeJanken(JankenHand.PAPER);

            // assert
            JankenResult expected = JankenResult.DRAW;
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void チョキに負ける() {
            // execute
            JankenResult actual = JankenHand.PAPER.executeJanken(JankenHand.SCISSORS);

            // assert
            JankenResult expected = JankenResult.LOSE;
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Nested
    class チョキは {
        @Test
        void グーに負ける() {
            // execute
            JankenResult actual = JankenHand.SCISSORS.executeJanken(JankenHand.ROCK);

            // assert
            JankenResult expected = JankenResult.LOSE;
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void パーに勝つ() {
            // execute
            JankenResult actual = JankenHand.SCISSORS.executeJanken(JankenHand.PAPER);

            // assert
            JankenResult expected = JankenResult.WIN;
            assertThat(actual).isEqualTo(expected);
        }

        @Test
        void チョキとあいこ() {
            // execute
            JankenResult actual = JankenHand.SCISSORS.executeJanken(JankenHand.SCISSORS);

            // assert
            JankenResult expected = JankenResult.DRAW;
            assertThat(actual).isEqualTo(expected);
        }
    }

    @Test
    void 日本語のすべての手を取得できる() {
        // execute
        List<String> actual = JankenHand.getAllHandsOnJapanese();

        // assert
        List<String> expected = List.of("グー", "パー", "チョキ");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 日本語の手からインスタンスを取得できる() {
        // execute
        JankenHand actual = JankenHand.getHandByJapanese("グー");

        // assert
        JankenHand expected = JankenHand.ROCK;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 存在しない日本語の手からインスタンスを取得しようとした場合例外が返る() {
        // execute & assert
        assertThatThrownBy(() -> JankenHand.getHandByJapanese("存在しない手"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("存在しない手 は存在しない手です。");
    }

    @Test
    void 英語のすべての手を取得できる() {
        // execute
        List<String> actual = JankenHand.getAllHandsOnEnglish();

        // assert
        List<String> expected = List.of("Rock", "Paper", "Scissors");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 英語の手からインスタンスを取得できる() {
        // execute
        JankenHand actual = JankenHand.getHandByEnglish("Rock");

        // assert
        JankenHand expected = JankenHand.ROCK;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 存在しない英語の手からインスタンスを取得しようとした場合例外が返る() {
        // execute & assert
        assertThatThrownBy(() -> JankenHand.getHandByEnglish("存在しない手"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("存在しない手 is not exist.");
    }
}
