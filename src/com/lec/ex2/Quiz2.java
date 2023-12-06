package com.lec.ex2;

public class Quiz2 {
	
	
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
