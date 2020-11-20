package com.hackerrank.arrays;

import java.util.Scanner;

public class ArrayLeftRotation {
	
	private static int[] rotLeft(int[]arr, int n)
	{
		int size=arr.length;
		int i=0;
		int rot_count=n;
		int[] temp=new int[arr.length];
		while(rot_count<size)
		{
			temp[i]=arr[rot_count];
			i++;
			rot_count++;
		}
		
		rot_count=0;
		while(rot_count<n)
		{
			temp[i]=arr[rot_count];
			i++;
			rot_count++;
		}
		
		return temp;
		
		
		
	}
	
    private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);
        for(int i=0; i<result.length; i++){
        	System.out.print(result[i]+"\t");
        }
        
      /*  for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));
            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        bufferedWriter.close();*/
        
        scanner.close();
	}

}
