package com.hackerrank.arrays;

public class HourGlass {
	
	private static int getResult(int arr[][])
	{
		int row=arr.length;
		int col=arr[0].length;
		int min=-63;
		int res=0;
		for(int i=0;i<row-2;i++)
		{
			for(int j=0;j<col-2;j++)
			{
				res=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
					 arr[i+1][j+1]+
					 arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				min=Math.max(res, min);				
			}

		}
		
		
		return min;
	}

	public static void main(String[] args) {
		int[][] array = {
				 {1,1,1,0,0,0},
				 {0,1,0,0,0,0},
				 {1,1,1,0,0,0},
				 {0,0,2,4,4,0},
				 {0,0,0,2,0,0},
				 {0,0,1,2,4,0}};
		
		int res=getResult(array);
		System.out.println(res);
	}

}
