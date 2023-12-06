package com.Jec.ex2;

public class Quiz2 {
	
	
//	Field
	
	int num = 0;
	

	
//	Constructor
	public void Input(int num) {
		this.num = num;
		
	}	
	
	
	
//	Method
	public void gugu() {
		for(int time=1; time<=9; time++) {
			System.out.println();
			for(int dan=num; dan<=num+3; dan++) {
				System.out.print(dan + " X " + time + " = " + String.format("%2d", dan * time) + "\t");
			} 
		}	
		
	}
}
