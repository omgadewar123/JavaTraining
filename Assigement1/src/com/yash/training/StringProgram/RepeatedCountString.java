package com.yash.training.StringProgram;
import java.util.Arrays;

public class RepeatedCountString {
	//4) WAP to print the number of alphabets repeated 
	//in the given string.

// other way
	public static void main(String[] args) {
		
		String a ="yash technologies magarpatta";
		
		char [] b =a.toCharArray();
		
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
			if(count>=1) {
				System.out.println(b[i]+":"+count);
				i+=(count-1);
			}
		}
		
	}
}
