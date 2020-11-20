package com.hackerrank.algorithm;

import java.util.Scanner;

public class FloorSum {

	public static int getFloorSum(int a)
	{
		int res=0;
		for(int i=1;i<=a;i++)
		{
			res+=a/i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]res=new int[n];
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			res[i]=getFloorSum(a);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(res[i]);
		}

	}

}
