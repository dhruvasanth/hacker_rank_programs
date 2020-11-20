package com.stg.test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctPairs {

	//private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int k=sc.nextInt();
//		int n=sc.nextInt();

String[] s=sc1.nextLine().split(" ");
		
		int[]a=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		int res=getDistinctCount(a,k);
		System.out.println(res); 
	}

	private static int getDistinctCount(int[]a, int k) {
		
		Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int com=k-a[i];
			if(hm.containsKey(com))
			{
				int val=hm.get(com)-1;
				count++;
				if(val==0)
					hm.remove(com);
				else
					hm.put(com,val);							
			}
			else {
				
				if(hm.containsKey(a[i]))
					hm.put(a[i],hm.get(a[i]+1));
				else
					hm.put(a[i],1);
			}												
		}								
		return count;
	}

}
