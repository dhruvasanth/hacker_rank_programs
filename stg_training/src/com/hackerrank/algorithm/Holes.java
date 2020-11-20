package com.hackerrank.algorithm;

import java.util.Scanner;

public class Holes {
	public static int getHoles(long n)
	{
		int holes[] = {1,0,0,0,1,0,1,0,2,1};
		int holecount=0;
		while(n>0)
		{
			holecount+=(holes[(int) (n%10)]);
			
			n/=10;
		}
		return holecount;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int res=getHoles(n);
		System.out.println(res);

	}

}
