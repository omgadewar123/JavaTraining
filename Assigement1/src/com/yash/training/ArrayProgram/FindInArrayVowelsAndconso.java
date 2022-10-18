package com.yash.training.ArrayProgram;

public class FindInArrayVowelsAndconso {
	
	public static void main(String[] args) {
		
		String a ="java";
		
		char c[]=a.toCharArray();
		
		char vowels;
		
		char conso;
		
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'|| c[i]=='i'||c[i]=='o'||c[i]=='u') {
				
				vowels=c[i];
				System.out.println("vowels:"+ vowels );
				
			}else {
				conso=c[i];
			
			
			
			
			System.out.println("conso: "+conso);
			}
			
		}
		}
		
		
	}


