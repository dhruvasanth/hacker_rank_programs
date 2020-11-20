package com.hackerrank.algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Paris {
	
	static int pairs(int gb_target, int[] arr) {
	    Set<Integer> gb_inputSet = new HashSet<Integer>();
	    int pairCount = 0;
       for(int gb_n=0; gb_n< arr.length; gb_n++){           
           gb_inputSet.add(arr[gb_n]);
        }       
        for(int n=0; n< arr.length; n++){
            if(gb_inputSet.contains(arr[n]+gb_target)){
                pairCount++;
            }
        }
        return pairCount;
    }

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int k=2;
		String[] s=sc.nextLine().split(" ");
		int[]a=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}

		int res=pairs(k,a);
		System.out.print(res);
	}

}
