package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day :");
		int day = input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today :");
		int elapsedDay = input.nextInt();
		elapsedDay = (elapsedDay + day) % 7  ;
		
		switch (day) {
			case 0:System.out.print("Today is Sunday ");break;
			case 1:System.out.print("Today is Monday ");break;
			case 2:System.out.print("Today is Thusday ");break;
			case 3:System.out.print("Today is Wednesday ");break;
			case 4:System.out.print("Today is Thursday ");break;
			case 5:System.out.print("Today is Friday ");break;
			case 6:System.out.print("Today is Saturday ");break;
			default : System.out.print(" Plese enter valid number!");break;
		}
		
		switch (elapsedDay) {
			case 0 :System.out.println("and future day is Sunday.");break;
			case 1 :System.out.println("and future day is Monday.");break;
			case 2 :System.out.println("and future day is Thusday.");break;
			case 3 :System.out.println("and future day is Wednesday.");break;
			case 4 :System.out.println("and future day is Thursday.");break;
			case 5 :System.out.println("and future day is Friday.");break;
			case 6 :System.out.println("and future day is Saturday.");break;
			default : System.out.println(" Plese enter valid number!");break;
		}
	}

}
