package com.hackerrank.algorithm;

import java.util.Scanner;

public class CommonChild {
	
	public static int getValue(String s1,String s2)
	{
		int result=0;
		int[][] temp=new int[s1.length()+1][s2.length()+1];
		
		for(int i=1;i<=s1.length();i++)
		{
			
			for(int j=1;j<=s2.length();j++)
			{
				
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					temp[i][j]=temp[i][j-1]+1;
				}
				else {
					temp[i][j]= Math.max(temp[i-1][j], temp[i][j-1]);
				}
				
			}

		}
		
		result=temp[s1.length()-1][s2.length()-1];
		return result;
		
	}

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int res=getValue(s1,s2);
		System.out.println(res);

	}

}
