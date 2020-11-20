package com.stg.test1;

import java.util.Scanner;

public class CoderFriends {



	 private static String winner(String inputone, String inputtwo) {
		  // calculating winners based on their scores
			 
			 int ericasScore = calculateScore(inputone);
			 int bobScore = calculateScore(inputtwo);
			 
		  if (ericasScore > bobScore) {
		   return "erica";
		  }
		  if (ericasScore < bobScore) {
		   return "bob";
		  } else
		   return "Tie";

		 }

	 private static int calculateScore(String input) {
		  int e_Score = 0;
		  char[] c = input.toCharArray();
		  for (char charelment : c) {
		   if (charelment == 'E') {
		    e_Score = e_Score + 1;
		   } else if (charelment == 'M') {
		    e_Score = e_Score + 3;
		   } else if (charelment == 'H') {
		    e_Score = e_Score + 5;
		   }
		  }

		  return e_Score;
		 }
	
	
	
		public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
			  System.out.println("enter the complexity of problems solved by erica ");
			  String inputone = scanner.next();
			  System.out.println("enter the complexity of problems solved by bob ");
			  String inputtwo = scanner.next();
			  String result = winner(inputone, inputtwo);
			  System.out.println(result);

			 }

	
	
}





 











