package org.contourgara.application;

import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;
import org.contourgara.domain.Language;

import java.util.Scanner;

public class JankenService {
    public void execute(Language language) {
        if (language.equals(Language.JAPANESE)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("プレイヤー1の手を入力してください");
            String player1 = sc.nextLine();
            System.out.println("プレイヤー2の手を入力してください");
            String player2 = sc.nextLine();
            getJankenResult(player1, player2);
            sc.close();
        }
        else if (language.equals(Language.ENGLISH)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your hand1");
            String player1 = sc.nextLine();
            System.out.println("enter your hand2");
            String player2 = sc.nextLine();
            System.out.println(getJankenResult(player1, player2));
            sc.close();
        }
    }


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
