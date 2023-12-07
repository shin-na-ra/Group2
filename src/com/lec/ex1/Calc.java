package com.lec.ex1;
/*
 *	Date : 2023.12.07
 *	Author : 심현빈
 *	Description : 10의 10승의 결과가 끝 자리를 맞추어 출력
 *  Version : v.1 - 코멘트 입력
 */
public class Calc {
	long i=1;
    long count=0;
    
    public void gugu() {
    	for(count=0; count<=10; count++, i*=10) {
        	System.out.println("10^"+String.format("%2d", count)+"="+String.format("%11d", i)); // 출력
    	}
 
	}
    
}