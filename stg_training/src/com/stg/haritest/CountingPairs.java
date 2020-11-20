package com.stg.haritest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountingPairs {

    private static final Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        List<Integer> al=new ArrayList<Integer>();
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            al.add(arrItem);
        }
        int result = pairs(k, al);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        System.out.println(result);
        scanner.close();
	}

	private static int pairs(int k, List<Integer> al) {

		int count=0;
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	//	Set<Integer> hm=new HashSet<Integer>();
		for(int i:al)
		{
			hm.put(i,i);

		}
		
		 for(Map.Entry<Integer,Integer> temp: hm.entrySet())
		{
		int val=temp.getKey()+k;
		if(hm.containsKey(val))
			count++;
		} 

		
		return count;
	}

}
