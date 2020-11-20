package com.stg.test2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {
	
	private static int getResult(int[] a,int k)
	{
		int res=0;
		Set<Integer>st=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			st.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(st.contains(a[i]-k))
				res++;
		}
		return res;
	}
	

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		String s[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		int[]a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int res=getResult(a,k);
		System.out.println(res);
	}

}
