package com.javaex.practice03;

import java.util.Scanner;
import java.util.Random;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력 도구
        Random random = new Random();            // 랜덤 숫자 생성 도구

        boolean keepPlaying = true;

        System.out.println("=========================");
        System.out.println(" 숫자 맞추기 게임 시작!");
        System.out.println("=========================");

        while (keepPlaying) {
            int answer = random.nextInt(100) + 1; // 1 ~ 100 랜덤 숫자 생성
            // System.out.println("정답은: " + answer); // 테스트용 출력

            while (true) {
                System.out.print("숫자 입력 >> ");
                int guess = sc.nextInt(); // 사용자 입력

                if (guess > answer) {
                    System.out.println("더 낮게");
                } else if (guess < answer) {
                    System.out.println("더 높게");
                } else {
                    System.out.println("맞았습니다!");
                    break; // 정답이면 반복 종료
                }
            }

            System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
            String response = sc.next();

            if (response.equalsIgnoreCase("n")) {
                keepPlaying = false;
                System.out.println("=========================");
                System.out.println(" 숫자 맞추기 게임 종료!");
                System.out.println("=========================");
            } else {
                System.out.println("=========================");
                System.out.println(" 새로운 게임 시작!");
                System.out.println("=========================");
            }
        }

        sc.close(); // 입력 도구 닫기
    }
}