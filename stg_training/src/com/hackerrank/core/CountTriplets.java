package com.hackerrank.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountTriplets {
	
	static long getResult(ArrayList<Long> al, long r)
	{
		long count=0;
		long[] arr=new long[al.size()];
		Map<Long,Long> rtmp=new HashMap<Long,Long>();
		Map<Long,Long> ltmp=new HashMap<Long,Long>();
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=al.get(i);
			rtmp.put(arr[i], 0l);
			ltmp.put(arr[i], 0l);
		}
		//System.out.println(rtmp);
		//System.out.println(ltmp);
		
		for(int i=0;i<arr.length;i++)
		{
			rtmp.put(arr[i], rtmp.get(arr[i])+1);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			long num1=arr[i];
			rtmp.put(num1,rtmp.get(num1)-1);
			
			if(num1%r==0)
			{
				long num2=num1/r;
				long num3=num1*r;
				if(ltmp.containsKey(num2) && rtmp.containsKey(num3))
				{
					count+=ltmp.get(num2)*rtmp.get(num3);
					//System.out.println(count);
				}
				
				
			}
			ltmp.put(num1, ltmp.get(num1)+1);
			//System.out.println(rtmp);
			//System.out.println(ltmp);
			
		}
	/*	long[] arr = new long[al.size()];
		long count=0;
		for(int i=0;i<arr.length;i++)		
			arr[i]=al.get(i);		
		for(int i=0;i<arr.length-2;i++)
		{
			System.out.println("test4");
			for(int j=i+1;j<arr.length-1;j++)
			{
				System.out.println("test3");
				if(arr[j]==arr[i]*r)
				{
					System.out.println("test2");
				for(int k=j+1;k<arr.length;k++)
				{
					System.out.println("test1");
					if(arr[k]==arr[i]*r*r)
					{
						System.out.println("test");
						count++;
					}
					
				}
				}
			}

		} */
		return count;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().replaceAll("\\s+$", "").split(" ");
		int n=Integer.parseInt(s[0]);
		long l=Long.parseLong(s[1]);
		//System.out.println(n+" "+l);	
		String[] arr=br.readLine().replaceAll("\\s+$", "").split(" ");
		ArrayList<Long> al=new ArrayList<Long>();
		
		for(int i=0;i<n;i++)
		{
			long tem=Long.parseLong(arr[i]);
			al.add(tem);
		}
		
		long res=getResult(al,l);
		System.out.println(res);
	}

}
