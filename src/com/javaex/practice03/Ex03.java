package com.javaex.practice03;

public class Ex03 {

	public static void main(String[] args) {
		
		//세로로 3개씩 떨어져있다
		int x,y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.println("*");
			}
			System.out.println("");
		}

	}

}
