package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students and each student’s name and score :");
		int numberOfStudent = input.nextInt();
		
		String name;
		int score;
		int max = 0;
		String maxScoreName = "";

		for (int i = 0; i < numberOfStudent; i++) {
			System.out.println("Student: " + (i + 1));
			
			System.out.print("  Name  : ");
			name = input.next();

			System.out.print("  Score : ");
			score = input.nextInt();

			if (score > max) {
				max = score;
				maxScoreName = name;
			}
		}

		System.out.println("Student with the highest score: " + maxScoreName);
	}

}
