package org.contourgara.domain;

public enum JankenHand {
    ROCK {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.DRAW;
                case PAPER -> JankenResult.LOSE;
                case SCISSORS -> JankenResult.WIN;
            };
        }
    },

    PAPER {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.WIN;
                case PAPER -> JankenResult.DRAW;
                case SCISSORS -> JankenResult.LOSE;
            };
        }
    },

    SCISSORS {
        @Override
        public JankenResult executeJanken(JankenHand opponentHand) {
            return switch (opponentHand) {
                case ROCK -> JankenResult.LOSE;
                case PAPER -> JankenResult.WIN;
                case SCISSORS -> JankenResult.DRAW;
            };
        }
    };

    public abstract JankenResult executeJanken(JankenHand opponentHand);
}
