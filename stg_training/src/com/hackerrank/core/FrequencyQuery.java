package com.hackerrank.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQuery {
	
	
	 static List<Integer> freqnQuery(List<List<Integer>> queries) {
		
		 Map<Integer,Integer> numFeqmp=new HashMap<Integer, Integer>();
		// Map<Integer,Integer> countFeqmp=new HashMap<Integer, Integer>();
		 List<Integer> result=new ArrayList<Integer>();
		 
		 for(List<Integer> values:queries)
		 {
			 int opt=values.get(0);
			 int val=values.get(1);
			 
			 if(opt==3)
			 {
				 if(numFeqmp.containsValue(val))
				 {
					 result.add(1);
				 }
				 else
				 {
					 result.add(0);
				 }
				 
			 }
			 else
			 {
				 if(opt==1)
				 {
					Integer beforeFrq=numFeqmp.get(val);
					beforeFrq=(beforeFrq==null) ? 0:beforeFrq;
					 if(beforeFrq==0)
					 {
						 numFeqmp.put(val, 1); 
					 }
					 else
					 {
						 numFeqmp.put(val, beforeFrq+1);
					 }
					 
				/*	 Integer count=countFeqmp.get(beforeFrq);
					 count=(count==null) ? 0:count;
					 if(count==0) {
						 
					 }else if(count==1)
					 {
						 countFeqmp.remove(beforeFrq);
					 }else {
						 countFeqmp.put(beforeFrq,count-1);
					 }
	                    Integer temp = countFeqmp.get(beforeFrq+1);
	                    temp = temp==null ? 0:temp;
	                    countFeqmp.put(beforeFrq+1, temp+1);	*/				 
				 }else if(opt==2) {
					 
					 Integer beforeFrq=numFeqmp.get(val);
					 beforeFrq=(beforeFrq==null)? 0:beforeFrq;
					 if(beforeFrq==0) {
						 
					 }else if(beforeFrq==1) {
						 numFeqmp.remove(val); 
					 }else {
						 numFeqmp.put(val, beforeFrq-1);
					 }
					 
				/*	 Integer count=countFeqmp.get(beforeFrq);
					 count=(count==null) ? 0:count;
					 if(count==0) {
						 
					 }else if(count==1)
					 {
						 countFeqmp.remove(beforeFrq);
					 }else {
						 countFeqmp.put(beforeFrq,count-1);
					 }
	                    Integer temp = countFeqmp.get(beforeFrq-1);
	                    temp = temp==null ? 0:temp;
	                    countFeqmp.put(beforeFrq-1, temp+1);	*/				 					 
				 }				 				 				
			 }			 								 
		 }
		return result;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
		//System.out.println(n);    
        List<List<Integer>> queries = new ArrayList<>();
        try {
            for (int i = 0; i < n; i++) {
                String[] queriesRowTempItems = br.readLine().replaceAll("\\s+$", "").split(" ");
                List<Integer> queriesRowItems = new ArrayList<>();
                for (int j = 0; j < 2; j++) {
                    int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                    queriesRowItems.add(queriesItem);
                }
                queries.add(queriesRowItems);
            }
            //System.out.println(queries);
            List<Integer> ans = freqnQuery(queries);
            for (int i = 0; i < ans.size(); i++) {
                System.out.println(String.valueOf(ans.get(i)));
            }
           
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }// try end
	}



}
