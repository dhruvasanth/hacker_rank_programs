package com.stg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAnagram {
	static int getCount(String s)
	{
		int result=0;
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				char[]c=s.substring(i, j+1).toCharArray();
				Arrays.sort(c);
				String k=new String(c);
				
				if(mp.containsKey(k)) {
					mp.put(k, mp.get(k)+1);					
				}else {
					mp.put(k, 1);
				}
				
			}
		}
		
		for(String k:mp.keySet())
		{
			int num=mp.get(k);
			result+=(num*(num-1))/2;
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		int res=getCount(s);
		System.out.println(res);
	}

}
