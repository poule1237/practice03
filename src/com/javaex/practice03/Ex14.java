package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        int sum = 0;

        
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            if (i < num) {
                System.out.print("+");
            }
            sum += i;
        }

        System.out.println();
        System.out.println("합계: " + sum);
        sc.close();
    }
}
