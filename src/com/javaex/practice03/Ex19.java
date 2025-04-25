package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0; 
        boolean run = true;

        while (run) {
            System.out.println("---------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------");
            System.out.print("선택> ");

            int i = scanner.nextInt();

            switch (i) {
                case 1:
                    System.out.print("예금액> ");
                    int a = scanner.nextInt();
                    c +=a;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int b = scanner.nextInt();
                    c -= b;
                    break;
                case 3:
                    System.out.println("잔고액> " + c);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("다시입력해주세요");
            }
        }

        scanner.close();
    }
}