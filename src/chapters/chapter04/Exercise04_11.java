package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal value (0 to 15): ");
		int d = input.nextInt();
		
		if (d >= 10 && d<=15 ) {
			
			switch(d) {
			
			case 10:System.out.println("The hex value is A");break;
			case 11:System.out.println("The hex value is B");break;
			case 12:System.out.println("The hex value is C");break;
			case 13:System.out.println("The hex value is D");break;
			case 14:System.out.println("The hex value is E");break;
			case 15:System.out.println("The hex value is F");break;
			}
			
		}else if (d >= 0 && d <= 9) {
			System.out.println("The hex value is " + d);
			
		}else {
			System.err.println("Invalid input");
		}
	}

}
