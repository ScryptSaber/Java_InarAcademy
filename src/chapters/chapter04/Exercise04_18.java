package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String s = input.next();
		
		char first = Character.toUpperCase(s.charAt(0));
		char second = s.charAt(1);
		
		switch(first) {
		case 'M':System.out.print("Mathematics");break;
		case 'C':System.out.print("Computer Science");break;
		case 'I':System.out.print("Information Technology");break;
		default : System.out.println("Invalid input");  System.exit(1);
		
		}
		switch(second) {
		case '1':System.out.println(" Freshman");break;
		case '2':System.out.println(" sophomore");break;
		case '3':System.out.println(" junior");break;
		case '4':System.out.println(" senior");break;
		default : System.out.println("Invalid input"); System.exit(1);
		 
		}
		

	}

}
