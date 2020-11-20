package com.stg.test2;

import java.util.Scanner;

public class PalindromCount {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int res=getCount(s);
		System.out.println(res);
		
		
	}

	private static int getCount(String s) {

		int len=s.length();
		int count=0;
		for(int i=0;i<2*len-1;i++)
		{
			int left=i/2;
			int right=left+i%2;
			
			while(left>=0 && right < len && s.charAt(right)==s.charAt(left))
			{
				count++;
				left--;
				right++;							
			}
			
			
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
