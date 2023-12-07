package com.lec.ex3;

public class Quiz3 {

	/*
     Date : 2023.12.07
	 Author : Seo-LEE
	 Description : 사용자에게 입력받고 퀴즈에 대한 결과 출력
	 Version : v.1 - 코멘트 입력
	 */

	//Field
	int fac = 1;

	//Constructor
	

	//Method
	public void factorial(int num) {
	
		for(int i=1; i<=num; i++) {
			fac *=i;
			
		}
		System.out.println(num + " 's factorial value =" + fac);
	}
}
