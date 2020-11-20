package com.hackerrank.arrays;

import java.util.Scanner;

public class ArrayManipulation {
	private static long arrayManipulation(int n, int[][] queries) {
		// TODO Auto-generated method stub
		
		long[] temp=new long[n];
		long max=0,res=0;
		for(int i=0;i<queries.length;i++)
		{
			int a=queries[i][0]-1;
			int b=queries[i][1]-1;
			int k=queries[i][2];
			
			temp[i]+=k;
			if(b+1<n)
			{
				temp[b+1]-=k;
			}
		}
		for(int j=0;j<temp.length;j++)
		{
			res+=temp[j];
			max=Math.max(max,res);
			
		}
		
		return max;
	}	
	

    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] queries = new int[m][3];
        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
        long result = arrayManipulation(n, queries);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        System.out.println(result);
        scanner.close();
	}


}
