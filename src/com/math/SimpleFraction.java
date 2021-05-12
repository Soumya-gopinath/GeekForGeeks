package com.math;

import java.util.HashMap;


//Given a fraction. Convert it into a decimal. 
//If the fractional part is repeating, enclose the repeating part in parentheses.
// 
//
//Example 1:
//
//Input: numerator = 1, denominator = 3
//Output: "0.(3)"
//Explanation: 1/3 = 0.3333... So here 3 is 
//recurring.
//O(K) K->constant

public class SimpleFraction {

	public static void main(String[] args) {
		 
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
			//checking if the new remainder is what we already processes , 
			//if yes then tat mean repeat
			//quotient values might come same for different remainder value
			//result.length has index where that remainder will be inserted in result
			//it is used to insert '(' when a repeatition encoutered.To know the start of recurring
			//fraction
			if(!map.containsKey(rem)) {
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
