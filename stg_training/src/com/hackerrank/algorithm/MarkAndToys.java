package com.hackerrank.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
	
	static int getResult(int k,int[]arr)
	{
		int result=0;
		int count=0;
		int i=0;
		Arrays.sort(arr);
		while(count<=k)
		{
			count+=arr[i];
			if(count<=k)
			{
			i++;
			result++;
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String[]s=sc.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		int[] arr=new int[n];
		String items[]=sc.nextLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(items[i]);
		}
		
		int res=getResult(k,arr);
		System.out.println(res);

	}

}
