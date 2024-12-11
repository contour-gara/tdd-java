package org.contourgara.application;

import lombok.RequiredArgsConstructor;
import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;

import java.io.Console;

@RequiredArgsConstructor
public class JankenUseCaseByEn implements JankenUseCase {
    private final Console console;

    @Override
    public JankenHand getPlayer1JankenHand() {
        console.printf("Enter hand of player1.%s", System.lineSeparator());
        return getJankenHand();
    }

    @Override
    public JankenHand getPlayer2JankenHand() {
        console.printf("Enter hand of player2.%s", System.lineSeparator());
        return getJankenHand();
    }

    private JankenHand getJankenHand() {
        return JankenHand.getHandByEnglish(
                new String(
                        console.readPassword(
                                String.format("Select a hand from the list. %s: ", JankenHand.getAllHandsOnEnglish())
                        )
                )
        );
    }

    @Override
    public void displayJankenResult(JankenResult jankenResult) {
        switch (jankenResult) {
            case WIN -> console.printf("Player 1 wins!%s", System.lineSeparator());
            case LOSE -> console.printf("Player 2 wins!%s", System.lineSeparator());
            case DRAW -> console.printf("Draw!%s", System.lineSeparator());
        }
    }
}
