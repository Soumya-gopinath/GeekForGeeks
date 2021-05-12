package com.math;

import java.util.Arrays;

public class SmallestPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {1,1,3,5,8,21};
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			Heapify(arr, n, i);
		}
		for(int i=n-1;i>0;i--) {
			long tmp=arr[i];
			arr[i]=arr[0];
			arr[0]=tmp;
			Heapify(arr, i, 0);
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		System.out.println("--------------");
		
		long target=1,arrSum=arr[0];
		for(int i=0;i<n;i++) {
			
            if(arr[i]<= target) {//if next value is <= target then we can get a sum.
            	//uodate target to next targer which is target +1
            	target+=arr[i]; //if suppose trget is 1 and we found it at position 1(or 0),we move on
            	//now next target will be 1+
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
