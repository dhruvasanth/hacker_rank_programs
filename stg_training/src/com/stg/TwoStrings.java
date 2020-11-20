package com.stg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

	static void showResult(String s1,String s2)
	{
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		Set<Character> set1=new HashSet<Character>();
		Set<Character> set2=new HashSet<Character>();
		for(int i=0;i<c1.length;i++)
		{
			set1.add(c1[i]);
		}
		for(int i=0;i<c2.length;i++)
		{
			set2.add(c2[i]);
		}	
		
		set1.retainAll(set2);
		System.out.print(set1);
		if(!set1.isEmpty())
{
	System.out.println("YES:");
}else
	System.out.println("NO:");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int m=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Scanner sc1=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
			String string1=sc1.nextLine();
			String string2=sc2.nextLine();
			showResult(string1,string2);
			
			
		}

	}

}
