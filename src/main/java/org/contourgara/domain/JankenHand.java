package org.contourgara.domain;

import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum JankenHand {
    ROCK("グー") {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.DRAW;
                case PAPER -> JankenResult.LOSE;
                case SCISSORS -> JankenResult.WIN;
            };
        }
    },

    PAPER("パー") {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.WIN;
                case PAPER -> JankenResult.DRAW;
                case SCISSORS -> JankenResult.LOSE;
            };
        }
    },

    SCISSORS("チョキ") {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.LOSE;
                case PAPER -> JankenResult.WIN;
                case SCISSORS -> JankenResult.DRAW;
            };
        }
    };

    private final String japanese;

    public abstract JankenResult executeJanken(JankenHand opponentHand);

    public static List<String> getAllHandsOnJapanese() {
        return Arrays.stream(values()).map(hand -> hand.japanese).toList();
    }

    public static JankenHand getHandByJapanese(String input) {
        return Arrays.stream(values())
                .filter(type -> type.japanese.equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s は存在しない手です。", input)));
    }
}
