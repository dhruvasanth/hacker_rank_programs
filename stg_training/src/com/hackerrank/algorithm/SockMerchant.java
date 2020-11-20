package com.hackerrank.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	
	//sockMerchant function code.
    static int sockMerchant(int n, int[] ar) {
    	int res = 0;
    	Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
    	for (Integer item : ar){ 
    		if (hm.remove(item) == null)
    			hm.put(item, 1); 
    		else { 
    			res = res + 1; 
    		} 
    	} //return res;
    	return res;
    }
	
	  private static final Scanner scanner = new Scanner(System.in);   
	public static void main(String[] args) {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("UserTemp")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = sockMerchant(n, ar);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        System.out.println(result);

        scanner.close();
	}

}
