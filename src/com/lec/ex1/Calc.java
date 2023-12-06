package com.lec.ex1;

public class Calc {
	long i=1;
    long count=0;
	
//    public Calc(long i,long count) {
//    	this.i = i;
//    	this.count = count;	
//	}
    
    public void gugu() {
    	for(count=0; count<=10; count++, i*=10) {
        	System.out.println("10^"+String.format("%2d", count)+"="+String.format("%11d", i));
    	}
 
	}
    
}