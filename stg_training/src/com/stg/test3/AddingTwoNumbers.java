package com.stg.test3;

public class AddingTwoNumbers {

	public static void main(String[] args) {

		float a=(float) 1.45;
		float b=(float) 5.76;
		
		getIntSum(a,b);

	}

	private static void getIntSum(float a, float b) {

		int res=(int) (a+b);
		System.out.println(res);
		
	}

}
