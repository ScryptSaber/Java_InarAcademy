package chapters.chapter04;

import java.util.Scanner;

public class Exercise04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String s = input.next();
		char c = s.charAt(0);

		if (Character.isLetter(c))
		{
			switch(Character.toUpperCase(c))
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case '0': 
				case 'U': System.out.println(c + " is a vowel"); break;
				default : System.out.println(c + " is a consonant"); 
			}
		}
		else
			System.out.println(c + " is an invalid input");

	}

}
