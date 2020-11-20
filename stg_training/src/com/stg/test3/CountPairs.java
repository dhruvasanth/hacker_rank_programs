package com.stg.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CountPairs {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		String s[]=sc.nextLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int k=Integer.parseInt(s[1]);
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		
		int res=getResult(al,k);
		System.out.println(res);
	}
	private static int getResult(List<Integer> al, int k) {

		Set<Integer> st=new HashSet<Integer>(al);
		List<Integer> rmdup=new ArrayList<Integer>(st);
		Collections.sort(rmdup);
		int a=0,b=0,count=0;
		int n=rmdup.size();
		while(b<n)
		{
			if(rmdup.get(b)-rmdup.get(a)==k)
			{
				count++;
				a++;
				b++;
			}
			else if(rmdup.get(b)-rmdup.get(a)>k)
			{
				a++;
			}
			else
				b++;
			
		}
		
		return count;
	}
}
