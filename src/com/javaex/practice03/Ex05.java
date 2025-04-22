package com.javaex.practice03;

public class Ex05 {

	public static void main(String[] args) {
		
		
		// 1 2 3 4 5
		int i = 1;
		boolean flag = true;
				
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}
		
	}

}
