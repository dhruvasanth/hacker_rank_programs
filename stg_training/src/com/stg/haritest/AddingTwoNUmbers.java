package com.stg.haritest;

public class AddingTwoNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a=(float) 1.23;
		float b=(float) 4.56;
		
		int i=getSum(a,b);
		System.out.println(i);
	}

	private static int getSum(float a, float b) {

		int res=(int) (a+b);
		return res;
	}

}
