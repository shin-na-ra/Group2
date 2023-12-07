package com.lec.ex2;

public class Quiz2 {
	
	
	/*
	 *	Date : 2023.12.07
	 *	Author : LEE-HWI
	 *	Description : 사용자에게 입력받고 퀴즈에 대한 결과 출력
	 *  Version : v.1 - 코멘트 작성
	 */
	
	
//	Field
	
	

	
//	Constructor

	
	
	
//	Method
	public void gugu(int num) {
		for(int time=1; time<=9; time++) {
			System.out.println();
			for(int dan=num; dan<=num+3; dan++) {
				System.out.print(dan + " X " + time + " = " + String.format("%2d", dan * time) + "\t");
			} 
		}	
		
	}
}
