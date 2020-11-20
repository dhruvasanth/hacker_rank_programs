package com.hackerrank.algorithm;

import java.util.Scanner;

public class AlternatingCharacters {
	
	public static  int showResult(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(i+1))
				count++;
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = scanner.nextLine();
			int res=showResult(s);
			System.out.println(res);
		}
	}

}
