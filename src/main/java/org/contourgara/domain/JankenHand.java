package org.contourgara.domain;

import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum JankenHand {
    ROCK("グー", "Rock") {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.DRAW;
                case PAPER -> JankenResult.LOSE;
                case SCISSORS -> JankenResult.WIN;
            };
        }
    },

    PAPER("パー", "Paper") {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.WIN;
                case PAPER -> JankenResult.DRAW;
                case SCISSORS -> JankenResult.LOSE;
            };
        }
    },

    SCISSORS("チョキ", "Scissors") {
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
    private final String english;

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

    public static List<String> getAllHandsOnEnglish() {
        return Arrays.stream(values()).map(hand -> hand.english).toList();
    }

    public static JankenHand getHandByEnglish(String input) {
        return Arrays.stream(values())
                .filter(type -> type.english.equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s is not exist.", input)));
    }

}
