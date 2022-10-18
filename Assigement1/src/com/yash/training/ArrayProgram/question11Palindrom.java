package com.yash.training.ArrayProgram;

public class question11Palindrom {
	
	public static void main(String[] args) {
		
   
        String[] str= {"abc","aa","a","dfg","gfg","racecar","name"};
        String[] result= new String[str.length];
        int i=0;
        
        for(String x:str) {
            if(palindrome(x))
                {
                    result[i]=x;
                    i++;
                }
            else
                {
                    continue;
                }
        }
        
        //Printing the non palindromic string
        System.out.println("Printing the string which are palindrome: ");
        for(String x: result)
        {
            if(x==null)
                {
                    break;
                }
            else
                {
                    System.out.println(x);
                }
        }
    }

	public static boolean palindrome(String x)
    {
        char[] ch=x.toCharArray();
        int n= ch.length;
        int count=0;
        for(int i=0; i<n/2;i++) {
            if(ch[i]==ch[n-i-1])
                {
                    count++;
                }
            else
                {
                    return false;
                }
        }
        
        if(count==n/2) {
            return true;
        }
        else return false;
    }

	

	

}
