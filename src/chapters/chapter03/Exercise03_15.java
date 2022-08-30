package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {
		// Generate a lottery number
		int lottery = 100 +(int)(Math.random() * 900);
		
		 // Prompt the user to enter a guess
		 Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter your lottery pick (three digits): ");
		 int guess = input.nextInt();
		
		 // Get digits from lottery
	     int lotteryDigit1 = lottery / 100;
		 int lotteryDigit2 = (lottery / 10) % 10;
		 int lotteryDigit3 =lottery % 10;
		
		 // Get digits from guess
		 int guessDigit1 = guess / 100;
		 int guessDigit2 = (guess / 10) % 10;
		 int guessDigit3 = guess % 10;
		
	     System.out.println("The lottery number is " + lottery);
		
		 // Check the guess
		 if (guess == lottery) {
		 System.out.println("Exact match: you win $10,000");
		 }
		 else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && guessDigit3 == lotteryDigit3 ||
		 		  guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3 ||
		 		  guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 ||
		 		  guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1 && guessDigit2 == lotteryDigit2 ||
		 		  guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2 && guessDigit1 == lotteryDigit1 )
		 {
			 System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
		 }
		 else if ( guessDigit1 == lotteryDigit1
		        || guessDigit1 == lotteryDigit2
		        || guessDigit1 == lotteryDigit3
		        || guessDigit2 == lotteryDigit1
		        || guessDigit2 == lotteryDigit2
		        || guessDigit2 == lotteryDigit3
		        || guessDigit3 == lotteryDigit1
		        || guessDigit3 == lotteryDigit2
		        || guessDigit3 == lotteryDigit3)  
		 {       
			 System.out.println("Mathed one number!!! 1,000$ Prize!!!");
		 } else 
			 System.out.println("Sorry no match :(");
		 
				 
	
	}

}
