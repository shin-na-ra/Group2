package com.lec.base;

import java.util.Scanner;

import com.lec.ex2.Quiz2;
import com.lec.ex3.Quiz3;
import com.lec.ex4.Quiz4;
import com.lec.ex1.Calc;

public class Main {

	/*
	 *	Date : 2023.12.07 v1
	 *	Author : SHIN-NA-RA
	 *	Description : 사용자에게 입력받고 퀴즈에 대한 결과 출력
	 */
	
	public static void main(String[] args) {

		int input = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		Scanner scanner = new Scanner(System.in);
		Quiz2 quiz2 = new Quiz2();
		Quiz3 quiz3 = new Quiz3();
		Quiz4 quiz4 = new Quiz4();
		Calc cal = new Calc();
		
		while(true) {
			System.out.print("원하는 결과물을 선택하세요 >>>> ");
			input = scanner.nextInt();
			
			switch (input){
			case 1 :		
				cal.gugu();
				System.out.println();		
				break;
				
			case 2 : 	
				System.out.print("Input your number : ");
				num2 = scanner.nextInt(); 
				quiz2.gugu(num2);
				System.out.println();				
				break;
				
			case 3 :	
				System.out.print("Input your number : ");
				num3 = scanner.nextInt(); 
				quiz3.factorial(num3);
				System.out.println();		
				break;
				
			case 4 :	
				System.out.print("몇 단계의 피라미드로 구성할까? : ");
				num4 = scanner.nextInt(); 
				quiz4.ex4(num4);
				System.out.println();		
				break;
				
			}
			
			if(input > 4) {
				System.out.println("종료");
				break;
			}
		}
		
		
	}

}
