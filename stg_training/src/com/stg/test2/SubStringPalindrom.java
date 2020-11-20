package com.stg.test2;

import java.util.ArrayList;
import java.util.List;

public class SubStringPalindrom {

	public static void main(String[] args) {

		String s="aaaa";
		int res=getCount(s);
		System.out.println(res);

	}

	private static int getCount(String s) {

		List<String> al=new ArrayList<String>();
		
		for(int i=0;i<s.length();i++)
		{
			
			identifyPal(s,i,i,al);
			identifyPal(s,i,i+1,al);
			
		}
		
		return al.size();
		
	}

	private static void identifyPal(String s, int low, int high, List<String> al) {

		
		while(low>=0 && high <s.length() && s.charAt(low)==s.charAt(high))
		{
			
			al.add(s.substring(low,high+1));
			low--;
			high++;
			
		}
		
		
	}

}
