package org.contourgara;

import org.contourgara.domain.JankenHand;
import org.contourgara.domain.JankenResult;

import java.util.Scanner;

public class JankenExecuter {
    public void execute() {
        System.out.println("じゃんけんを始めます！！！！");

        Scanner scanner = new Scanner(System.in);

        System.out.println("プレイヤー1の方の入力");
        System.out.println("グー・チョキ・パーから選択してください");
        String hand1 = scanner.next();
        JankenHand jankenHand1 = new JankenHandConverter(hand1).convert();

        System.out.println("プレイヤー2の方の入力");
        System.out.println("グー・チョキ・パーから選択してください");
        String hand2 = scanner.next();
        JankenHand jankenHand2 = new JankenHandConverter(hand2).convert();

        JankenResult jankenResult = jankenHand1.executeJanken(jankenHand2);
        switch (jankenResult) {
            case WIN -> System.out.println("プレイヤー1の勝ち！");
            case LOSE -> System.out.println("プレイヤー2の勝ち！");
            case DRAW -> System.out.println("あいこ！");
        }
    }
}
