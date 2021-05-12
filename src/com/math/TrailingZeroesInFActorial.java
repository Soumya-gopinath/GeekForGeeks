package com.math;

//For an integer N find the number of trailing zeroes in N!.
//
//Example 1:
//
//Input:
//N = 5
//Output:
//1
//Explanation:
//5! = 120 so the number of trailing zero is 1.
//O(LogN)

public class TrailingZeroesInFActorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=125;
		int count=0;
        for(int i=5;i<=N;i=i*5){
            count+=(N/i);
        }
        
        System.out.println(count);

	}

}
