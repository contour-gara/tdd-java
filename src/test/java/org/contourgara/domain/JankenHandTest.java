package org.contourgara.domain;

import static org.assertj.core.api.Assertions.*;

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
}