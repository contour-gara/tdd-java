package org.contourgara.application;

import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;

public class JankenService {



    public JankenResult getJankenResult(String player1, String player2) {
        JankenHand hand1 = toJankenHand(player1);
        JankenHand hand2 = toJankenHand(player2);
        return hand1.executeJanken(hand2);
    }

    private static JankenHand toJankenHand(String hand) {
        if (hand.equals("グー")) {
            return JankenHand.ROCK;
        }
        if (hand.equals("パー")) {
            return JankenHand.PAPER;
        }
        if (hand.equals("チョキ")) {
            return JankenHand.SCISSORS;
        }
        System.out.println("ちゃんと入力してください");
        throw new RuntimeException();
    }
}
