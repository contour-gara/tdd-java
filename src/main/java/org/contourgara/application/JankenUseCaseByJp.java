package org.contourgara.application;

import lombok.RequiredArgsConstructor;
import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;

import java.io.Console;

@RequiredArgsConstructor
public class JankenUseCaseByJp implements JankenUseCase {
    private final Console console;

    @Override
    public JankenHand getPlayer1JankenHand() {
        console.printf("プレイヤー 1 の手を入力してください。%s", System.lineSeparator());
        return getJankenHand();
    }

    @Override
    public JankenHand getPlayer2JankenHand() {
        console.printf("プレイヤー 2 の手を入力してください。%s", System.lineSeparator());
        return getJankenHand();
    }

    private JankenHand getJankenHand() {
        return JankenHand.getHandByJapanese(
                new String(
                        console.readPassword(
                                String.format("%s から選択してください。: ", JankenHand.getAllHandsOnJapanese())
                        )
                )
        );
    }

    @Override
    public void displayJankenResult(JankenResult jankenResult) {
        switch (jankenResult) {
            case WIN -> console.printf("プレイヤー 1 の勝ち！%s", System.lineSeparator());
            case LOSE -> console.printf("プレイヤー 2 の勝ち！%s", System.lineSeparator());
            case DRAW -> console.printf("あいこ！%s", System.lineSeparator());
        }
    }
}
