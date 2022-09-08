package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students and each student’s name and score :");
		int numberOfStudent = input.nextInt();

		String name;
		int score;
		int max1 = 0;
		int max2 = 0;
		String firstMaxName = "";
		String secondMaxName = "";

		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println("Student: " + (i + 1));

			System.out.print("  Name  : ");
			name = input.next();

			System.out.print("  Score : ");
			score = input.nextInt();

			if (i == 0) {
				max1 = score;
				firstMaxName = name;
			}
			else if (i == 1 && score > max1) {
				max2 = max1;
				secondMaxName = firstMaxName;
				
				max1 = score;
				firstMaxName = name;
			}
			else if (i == 1) {
				max2 = score;
				secondMaxName = name;
			}
			else if (i > 1 && score > max1 && score > max2) {
				max2 = max1;
				secondMaxName = firstMaxName;
				
				max1 = score;
				firstMaxName = name;
			} 
			else if (i > 1 && score > max2) {
				secondMaxName = name;
				max2 = score;
			}
		}

		System.out.println("Student with the highest score: " + firstMaxName
				+ "\nStudent with the second highest score: " + secondMaxName);

	}

}
