package com.stg.test3;

import java.util.Arrays;

class Comparator
{
	
	public boolean  compare(int a,int b)
	{
		if(a==b)
			return true;
		else
			return false;
	}
	
	public boolean compare(String a,String b)
	{
		return a.equals(b);
	}
	
	public boolean compare(int[]a,int[] b)
	{
		if(a.length!=b.length)
			return false;
		
		else
		{
			Arrays.sort(a);
			Arrays.sort(b);
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
					return false;
			}
			
				return true;
			
		}
		
		
	}
	
}

public class CompatarorExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
