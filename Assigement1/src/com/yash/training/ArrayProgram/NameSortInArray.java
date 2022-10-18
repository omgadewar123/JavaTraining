
package com.yash.training.ArrayProgram;

import java.util.Scanner;

public class NameSortInArray {
	

	public static void main(String[] args) {
	
		String temp;
		System.out.println("Enter the number you want sort array");
	
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String name []= new String [n];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the all element you want sort");
		for(int i=0;i<n;i++) {
			name[i]=sc1.nextLine();
		
		}
		for(int i=0;i<name.length;i++) {
			
			for(int j=i+1;j<name.length;j++) {
				
				if(name[i].compareTo(name[j])>0) {
					temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
				
			}
			
			
			
		}
		System.out.println("sorted array");
		for(String o:name) {
		
			System.out.println(o);
		}
		
		
		
		
	
}

	

}
