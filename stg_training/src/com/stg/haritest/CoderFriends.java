package com.stg.haritest;

public class CoderFriends {

	public static void main(String[] args) {

		String s1="EHH";
		String s2="EME";
		System.out.println(showWinner(s1,s2));

	}

	private static String showWinner(String s1, String s2) {

		int val1=getVal(s1);
		int val2=getVal(s2);
		if(val1>val2)
			return "Erica";
		else if(val2>val1)
			return"Bob";
		else
			return"game";
		
	}

	private static int getVal(String s1) {

		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			
			
			if(s1.charAt(i)=='E')
				count+=1;
			else if(s1.charAt(i)=='M')
				count+=3;
			else
				count+=5;
		}
		return count;
	}

}






