package com.hackerrank.algorithm;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		long res=getCount(s,n);
		System.out.println(res);
				

	}

	private static long getCount(String s, int n) {
    	long countForSubstring = 0;
        long totalCount = 0;
        
        //Determines how many a's are in a substring
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                countForSubstring++;
            }
        } // for - loop 
        
        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();        
        totalCount += divisor * countForSubstring;        
        
        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();	        
        for(int i = 0; i < remainder; i++){
            if(s.charAt(i) == 'a'){
                totalCount++;
            }
        } // for - loop     
        //System.out.println(totalCount);
        return totalCount;

	}

}
