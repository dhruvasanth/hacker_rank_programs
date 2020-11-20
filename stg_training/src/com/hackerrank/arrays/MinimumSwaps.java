package com.hackerrank.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumSwaps {
	
	private static int minimumSwaps(int arr[])
	{
		boolean b[]=new boolean[arr.length+1];
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int count=0;
		for(int i=1;i<b.length;i++)
		{
			hm.put(i, arr[i-1]);			
		}
		
		for(int k=1;k<hm.size();k++)
		{
			int nxtNode;
			if(b[k]==false)
			{
				b[k]=true;
				
				if(k==hm.get(k))
					continue;
				else {
					int c=hm.get(k);
					while(!b[c]){
						b[c]=true;
						nxtNode=hm.get(c);
						c=nxtNode;
						++count;
						
						
					}
					
				}
			}
			
		}
		
		return count;
	}

	
    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

	       //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);
        //bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();
        //bufferedWriter.close();

        scanner.close();

	}

}
