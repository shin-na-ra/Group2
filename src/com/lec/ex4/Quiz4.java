package com.lec.ex4;

public class Quiz4 {
	

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
