package com.yash.training.ArrayProgram;

public class ThirdLargestNumber {
//1) WAP to find third maximum number from list of numbers.

	public static void main(String[] args) {
		
		int a[]= {3,1,4,5,2};
		
		
		
		int max =Math.max(a[0], a[1]);
		
		int secondmax  = Math.min(a[0],a[1]);
		
		int thirdmax = Integer.MIN_VALUE;
		
		for(int i=2;i<a.length;i++) {
			
			if(a[i]>thirdmax) 
				thirdmax=a[i];
			if(a[i]> secondmax) {
				thirdmax=secondmax;
				secondmax=a[i];
				
			}
			if(a[i]>max) {
				secondmax=max;
				max=a[i];
			}
		}
		System.out.println("Thirdmax :"+thirdmax);
		
		
	}
	
	
}
