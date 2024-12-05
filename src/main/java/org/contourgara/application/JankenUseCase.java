package org.contourgara.application;

import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;

public interface JankenUseCase {
    default void execute() {
        while (true) {
            JankenHand player1Hand = getPlayer1JankenHand();
            JankenHand player2Hand = getPlayer2JankenHand();
            JankenResult jankenResult = player1Hand.executeJanken(player2Hand);
            displayJankenResult(jankenResult);
            if (jankenResult != JankenResult.DRAW) break;
        }
    }

    JankenHand getPlayer1JankenHand();
    JankenHand getPlayer2JankenHand();
    void displayJankenResult(JankenResult jankenResult);
}
