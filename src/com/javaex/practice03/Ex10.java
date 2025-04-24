package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	int sum;

    System.out.println("숫자를 입력하세요");

    // 첫 번째 숫자를 먼저 받고 max에 저장
    System.out.print("숫자: ");
    sum = sc.nextInt();

    // 나머지 4개 숫자를 입력받고 비교
    for (int i = 1; i < 5; i++) {
        System.out.print("숫자: ");
        int num = sc.nextInt();

        if (num > sum) {
            sum = num;
        }
    }

    System.out.println("최대값은 " + sum + "입니다.");
    sc.close();
	}

}
