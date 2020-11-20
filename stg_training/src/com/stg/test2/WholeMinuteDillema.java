package com.stg.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//????????????? ??
public class WholeMinuteDillema {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String[] s=sc.nextLine().split(" ");
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<s.length;i++)
		{
			al.add(Integer.parseInt(s[i]));
		}
		int res=getCount(al);
		System.out.println(res);
		
	}

	private static int getCount(List<Integer> al) {
		
		int c=60,count=0;
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
				
		for(int i=0;i<al.size();i++)
		{
			int mod=al.get(i)%c;
			int com=c-mod == c ? 0 : c-mod;
			
			if(hm.containsKey(com))
			{
				count+=hm.get(com);
			}
			if(hm.containsKey(mod))
			{
				hm.put(mod, hm.get(mod)+1);
			}
				if(! hm.containsKey(mod))
				{
					hm.put(mod,1);
				}	
			
			
		}
		return count;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
