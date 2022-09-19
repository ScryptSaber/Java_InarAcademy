package chapters.chapter06;

public class Exercise06_16 {

	public static void main(String[] args) {
		System.out.println("Number of days " + numberOfDaysInAYear(2020));
	}

	public static int numberOfDaysInAYear(int year) {
		int totalDays = 0;
		for (int i = 2000; i < year; i++) {
			if (isLeapYear(i)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}

		}
		return totalDays;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
