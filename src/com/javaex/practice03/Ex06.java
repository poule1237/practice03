package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
            if (i % 35 == 0) {  // 35의 배수인지 확인
                System.out.println(i);
            }
        }
	}

}
