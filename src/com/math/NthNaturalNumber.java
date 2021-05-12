package com.math;

//Given a positive integer N. You have to find Nth natural number after removing all the numbers
//containing digit 9 .
//
//
//Example 1:
//
//Input:
//N = 8
//Output:
//8
//Explanation:
//After removing natural numbers which contains
//digit 9, first 8 numbers are 1,2,3,4,5,6,7,8
//and 8th number is 8.
//O(LogN)

public class NthNaturalNumber {

	public static void main(String[] args) {
		
		//no number 9 makes the total digits available to 8
		//which makes it base9 number system (0-8)
		// so convert the given number to base9 and newbase result will be the answer
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
