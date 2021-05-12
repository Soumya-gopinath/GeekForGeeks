package com.math;

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
