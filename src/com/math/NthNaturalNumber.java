package com.math;

public class NthNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long N=18;
		long rem=N%9;
		long newBase=0;
		long mul=1;
		while(N>0) {
			
			newBase+=rem*mul;
			N=N/9;
			rem=N%9;
			mul=mul*10;
		}
		System.out.println(newBase);
		
		
		

	}

}
