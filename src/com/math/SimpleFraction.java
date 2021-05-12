package com.math;

import java.util.HashMap;

public class SimpleFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checking if the new remainder is what we already processes , 
		//if yes then tat mean repeat
		//remainder if repeat means repetition, quo values might come same
		//for different reminder value
		int numerator=18;
		int denominator=19;
		StringBuilder result=new StringBuilder();
		String ans="";
		HashMap<Long,Integer> map=new HashMap<Long,Integer>();
		long quo = numerator/denominator;
		long rem = numerator%denominator;
		result.append(quo);
	    if(rem != 0) {
	        result.append(".");
		}else{
		    ans=result.toString();
		}
		boolean flag=true;
		while(rem !=0) {
			flag=false;
			rem=rem*10;
			if(!map.containsKey(rem)) {//checking if th enew remainder is what we already processes , if yes then tat mean repeat

				quo=rem/denominator;
				map.put(rem, result.length());
				result.append(quo);
				ans=result.toString();
			}else {
				int index=map.get(rem);
				ans=result.subSequence(0,index)+"("+result.substring(index)+")";
				break;
			}
			
			rem=rem%denominator;
		}
		
		System.out.println(ans);
				
	}

}
