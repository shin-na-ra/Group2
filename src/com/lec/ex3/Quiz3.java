package com.lec.ex3;

public class Quiz3 {


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
