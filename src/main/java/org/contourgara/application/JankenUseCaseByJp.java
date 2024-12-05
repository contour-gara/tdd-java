package org.contourgara.application;

import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;

public class JankenUseCaseByJp implements JankenUseCase {
    @Override
    public JankenHand getPlayer1JankenHand() {
        System.out.println("プレイヤー 1 の手を入力してください。");
        return getJankenHand();
    }

    @Override
    public JankenHand getPlayer2JankenHand() {
        System.out.println("プレイヤー 2 の手を入力してください。");
        return getJankenHand();
    }

    private JankenHand getJankenHand() {
        return JankenHand.getHandByJapanese(
                new String(
                        System.console().readPassword(
                                String.format("%s から選択してください。: ", JankenHand.getAllHandsOnJapanese())
                        )
                )
        );
    }

    @Override
    public void displayJankenResult(JankenResult jankenResult) {
        switch (jankenResult) {
            case WIN -> System.out.println("プレイヤー 1 の勝ち！");
            case LOSE -> System.out.println("プレイヤー 2 の勝ち！");
            case DRAW -> System.out.println("あいこ！");
        }
    }
}
