package com.yash.training.ArrayProgram;
//2) WAP to find duplicate numbers and there counting 
//from list of numbers.

import java.util.Arrays;

public class DuplicateNumberAndCount {

	public static void main(String[] args) {
	int b[]= {1,4,4,8,7,5,3,0,3,2,6,3};	
		
 
		
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			
			int count =1;
			
			for(int j =i+1;j<b.length;j++) {
		       if(b[i]==b[j]) {
		    	   count++;
		       }else {
		    	   break;
		       }
		
				
			}
			if(count>1) {
				System.out.println(b[i]+":"+count);
				i+=(count-1);
			}
		}

	}
}
