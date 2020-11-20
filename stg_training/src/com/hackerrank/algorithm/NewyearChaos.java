package com.hackerrank.algorithm;

import java.util.Scanner;


public class NewyearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		int[] a=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			int temp=Integer.parseInt(str[i]);
			a[i]=temp;
		}
		int res=getResult(a);
		System.out.println(res);
		
	}

	private static int getResult(int[] a) {

			int result=0;
			
			for(int i=a.length-1;i>=0;i--)
			{
				
				if(a[i]!=i+1)
				{
					
					if((i-1>=0)  && (a[i-1]==i+1) )
					{
						result++;
						swap(i,i-1,a);
					}										
				else if((i-2>=0)  && (a[i-2]==i+1) )
				{
					result+=2;
					swap(i-2,i-1,a);
					swap(i-1,i,a);					
				}
				else
					return -1;
				
				}
			}
		
		return result;
	}

	private static void swap(int i, int j, int[] a) {

			int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;			
	}

}
