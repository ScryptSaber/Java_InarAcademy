package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String s = input.nextLine();
		
		boolean isValid = 
				(s.length() == 11) && 
				(Character.isDigit(s.charAt(0))) &&
				(Character.isDigit(s.charAt(1))) &&
				(Character.isDigit(s.charAt(2))) &&
				(s.charAt(3) == '-') &&
				(Character.isDigit(s.charAt(4))) &&
				(Character.isDigit(s.charAt(5))) &&
				(Character.isDigit(s.charAt(7))) &&
				(s.charAt(6) == '-') &&
				(Character.isDigit(s.charAt(8))) &&
				(Character.isDigit(s.charAt(9))) &&
				(Character.isDigit(s.charAt(10)));
	
		System.out.print(s + " is a ");
		if (isValid) {
			System.out.print("valid");
		} else {
			System.out.print("invalid");
		}
		System.out.print(" social security number");
	}

}
