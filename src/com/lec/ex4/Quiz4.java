package com.lec.ex4;

public class Quiz4 {
	
	/*
	 *	Date : 2023.12.07 v1
	 *	Author : SHIN-NA-RA
	 *	Description : 사용자에게 입력받은 숫자로 피라미드 단계 나타내기
	 */

	public Quiz4() {
		
	}
	
	public void ex4(int num) {
		int count = 1;
		for (int i = 1; i <=num; i++) {
			System.out.println();
			
			for(int j=1; j <= i; j++) {
				System.out.print(String.format("%2d", count) + "  ");
				count++;
			}
		}
	}
	
}
