package com.yash.training.StringProgram;

public class RepatingAlphabets {
	
	//4) WAP to print the number of alphabets repeated in 
	//the given string.

	public static void main(String[] args) {
		
		String s ="yash technology";
		
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			
			for(int j=i+1;j<c.length;j++) {
				
				if(c[i]==c[j]) {
				System.out.println("repeated char :"+c[j]);	
				
				
				
				break;
				}
			}
		}
		
	}

}
