package com.hackerrank.algorithm;

import java.util.Scanner;

public class JumpingOntheClouds {
	
	public static int getCount(int input[])
	{
		int res=0;
		for(int i=0;i<input.length-2;)
		{
			if(input[i+2]==0)
			{
				res++;
				i=i+2;
			}
			
			else if(input[i+1]==0)
			{
				res++;
				i=i+1;
			}
			else
				return -1;
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]input=new int[n];
		
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();			
		}

		int res=getCount(input);

				System.out.print(res)	;	

	}

}
