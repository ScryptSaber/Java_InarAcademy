package chapters.chapter02;

import java.util.Scanner;

public class Exercise02_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.println(" Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();

		System.out.println("Enter number of years: ");
		double numberOfYears = input.nextDouble();

		double montlyInterestRate = annualInterestRate / 1200;
		double futureInvestmentValue = investmentAmount * Math.pow((1 + montlyInterestRate), (numberOfYears * 12));

		System.out.println("Accumulated value is " + futureInvestmentValue);
	}

}
