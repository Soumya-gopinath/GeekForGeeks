package com.math;

//Given an array of size N, find the smallest positive integer value that cannot be 
//represented as sum of some elements from the array.
//
//
//Example 1:
//
//Input: 
//N = 6
//array[] = {1, 10, 3, 11, 6, 15}
//Output: 
//2
//Explanation:
//2 is the smallest integer value that cannot 
//be represented as sum of elements from the array

public class SmallestPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {1,1,3,5,8,21};
		int n=arr.length;
		
		//we sort the elements using heap sort in O(NlogN) time
		for(int i=(n/2)-1;i>=0;i--) {
			Heapify(arr, n, i);
		}
		for(int i=n-1;i>0;i--) {
			long tmp=arr[i];
			arr[i]=arr[0];
			arr[0]=tmp;
			Heapify(arr, i, 0);
		}
		
		long target=1;
		for(int i=0;i<n;i++) {
			
			//if next value is <= target then we can get a sum.
        	//update target to next target which is target +1
            if(arr[i]<= target) {
            	
            	//if suppose target is 1 and we found it at position 1(or 0),we move on
            	//now next target will be 1+sum off all previous array values
            	target+=arr[i]; 
            	
            }else {
            	break;
            }
            
            
        }
        System.out.println( target);
	
	}
	
	public static void Heapify(long arr[],int n,int i) {
		int largestIndex=i;
		int lIndex=2*i+1;
		int rIndex=2*i+2;
		
		if(lIndex < n && arr[lIndex] > arr[largestIndex]) {
			largestIndex=lIndex;
		}
		
		if(rIndex <n && arr[rIndex] > arr[largestIndex]){
			largestIndex=rIndex;
		}
		
		if(i != largestIndex) {
			long tmp=arr[i];
			arr[i]=arr[largestIndex];
			arr[largestIndex]=tmp;
			Heapify(arr, n, largestIndex);
			
		}
	}

}
