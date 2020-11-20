package com.stg.dineshtest;

public class AddingTwoNumbers {

	public static void main(String[] args) {

		float f1=(float) 1.52;
		float f2=(float) 7.52;

		int res=getSum(f1,f2);
		System.out.println(res);
	}

	private static int getSum(float f1, float f2) {

		return (int) Math.floor(f1+f2);
	}

}
