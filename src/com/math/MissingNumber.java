package com.math;

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
