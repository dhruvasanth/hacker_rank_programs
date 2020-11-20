package com.stg;

import java.util.Scanner;

public class Finbuzz {

	public static void main(String[] args) {
		
		System.out.println("enter limit value");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)			
			System.out.print("Finn");			
			 if(i%5==0)
		    System.out.print("buzz");			
			else if(i%3 !=0)
				System.out.print(i);
			    System.out.println();
		    
			}
	}

}
