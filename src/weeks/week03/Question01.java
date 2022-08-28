package weeks.week03;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your salary ?");
		double salary = input.nextDouble();
		
		System.out.println("How long have you worked ?");
		int years = input.nextInt();
		
		if(years > 5) {
			System.out.println("You have bonus, so your salary is" + ((salary * 0.05) +salary));
		}else{
			System.out.println(" your salary is " + salary);
		}

	}

}
