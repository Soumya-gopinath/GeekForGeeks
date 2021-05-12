package com.math;

//Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N.
//Find the missing element.
//
//Example 1:
//
//Input:
//N = 5
//A[] = {1,2,3,5}
//Output: 4
//O(N)

public class MissingNumber {
	
	public static void main(String args[]) {
	        // Your Code Here
			int[] array= {1,2,3,5};
			int n=array.length;
	        int tot=n+1;
	        int totalSum = (tot*(tot+1))/2;
	        int sum=0;
	        for(int i=0;i<n;i++){
	           sum+=array[i]; 
	        }
	        
	       System.out.println(totalSum-sum);
	    
	}

}
