package com.yash.training.StringProgram;

public class RemoveVowelsString {

	// remove vowels in string 
	public static void main(String[] args) {
		
		String s ="apple";
		
		char [] k =s.toCharArray();
		
		char result;
		
		char notvowels;
		
		for(int i=0;i<k.length;i++) {
			
		
		if(k[i]=='a'||k[i]=='e'|| k[i]=='i' || k[i]=='o'||k[i]=='u') {
			
			result=k[i];
		}else {
			notvowels=k[i];
			System.out.println(notvowels);	

		}
		

		}
		
	}
}
