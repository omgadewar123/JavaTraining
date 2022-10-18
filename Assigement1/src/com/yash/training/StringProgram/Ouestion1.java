package com.yash.training.StringProgram;

import java.util.Scanner;

public class Ouestion1 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string: ");  
        String str1= sc.nextLine();  
        System.out.print("Enter the index where you want to add second String: ");  
        int index= sc.nextInt();
        System.out.print("Enter second string: ");
        Scanner sc1= new Scanner(System.in);
        String str2= sc1.nextLine();
        
        char[] ch1= str1.toCharArray();
        char[] ch2=str2.toCharArray();
        
        String result="";
        
        
        for(int i=0; i<index;i++)
        {
            result+=ch1[i];
        }
        for(int i=0; i<str2.length();i++)
        {
            result+=ch2[i];
        }
        for(int i=index; i<str1.length();i++)
        {
            result+=ch1[i];
        }
        
        System.out.println(result);



   }
	}


