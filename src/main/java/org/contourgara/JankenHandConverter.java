package org.contourgara;

import lombok.RequiredArgsConstructor;
import org.contourgara.domain.JankenHand;

@RequiredArgsConstructor
public class JankenHandConverter {
    private final String hand;

    public JankenHand convert() {
        if (hand.equals("グー")) {
            return JankenHand.ROCK;
        } else if (hand.equals("チョキ")) {
            return JankenHand.SCISSORS;
        } else if (hand.equals("パー")){
            return JankenHand.PAPER;
        }

        throw new IllegalArgumentException("入力された文字列が不正です。");
    }
}
