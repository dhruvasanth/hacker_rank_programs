package com.stg.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DivisableSumpairs {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//int c=3;
		String s[]=sc.nextLine().split(" ");
		int[]n=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			n[i]=Integer.parseInt(s[i]);
		}

		int res=getCount(n);
		System.out.println(res);
	}

	private static int getCount(int[] n) {
		
		int count=0;
		int c=60;
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n.length;i++)
		{
			
			int mod=n[i]%c;
			int key=c - mod == c ? 0 : c-mod;
		//	int key=c-mod;
			if(hm.containsKey(key))
			{
				count+=hm.get(key);
				//hm.put(key,hm.get(key)+1);
			}
			if(hm.containsKey(mod))
			{
				hm.put(mod,hm.get(mod)+1);
			}
			if(!hm.containsKey(mod))
			{
				hm.put(mod,1);
			}			
			
		}

		return count;
	}

}
