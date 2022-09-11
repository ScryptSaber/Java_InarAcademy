package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter the day (for Sunday 0,Monday 1..etc.) : ");
		int day = input.nextInt();

		for (int month = 1; month <= 12; month++) {
			mnt(month, year);
			System.out.println("---------------------------------------------");
			System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");

			day %= 7;
			for (int b = 0; b <= day * 7; b++) {
				System.out.print(" ");
			}

			int lastDay = 0;
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				lastDay += 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				lastDay += 30;
			} else {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					lastDay += 29;
				else
					lastDay += 28;
			}
			for (int d = 1; d <= lastDay; d++) {

				if (d < 10) {
					System.out.print(" ");
				}
				if (day % 7 == 6) {
					System.out.print(d + "\n ");
				} else {
					System.out.print(d + "     ");
					if (d == lastDay) {
						System.out.println();
					}
				}
				day++;

			}

		}

		System.out.println();
	}
	
	public static void mnt(int day,int year) {
	switch(day) {
	case 1:System.out.println("\n               January " + year  );break;
	case 2:System.out.println("\n               February " + year   );break;
	case 3:System.out.println("\n               March " + year );break;
	case 4:System.out.println("\n               April " + year );break;
	case 5:System.out.println("\n               May " + year );break;
	case 6:System.out.println("\n               June " + year );break;
	case 7:System.out.println("\n               July " + year );break;
	case 8:System.out.println("\n               August " + year );break;
	case 9:System.out.println("\n               Septembre " + year);break;
	case 10:System.out.println("\n              October " + year );break;
	case 11:System.out.println("\n              November " + year );break;
	case 12:System.out.println("\n              December " + year );break;
	
	
	}
}
}
