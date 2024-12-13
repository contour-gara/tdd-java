package org.contourgara;

import org.contourgara.application.JankenService;
import org.contourgara.domain.JankenResult;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JankenService service = new JankenService();
        System.out.println("言語を選択してください。");
        String inputLanguage = sc.nextLine(); // 日本語or英語

        System.out.println("プレイヤー1の手を入力してください");
        String player1 = sc.nextLine();
        System.out.println("プレイヤー2の手を入力してください");
        String player2 = sc.nextLine();

        JankenResult player1Result = service.getJankenResult(player1, player2);

        System.out.println(player1Result.name());
        sc.close();
    }


}
