package chapters.chapter05;

public class Exercise05_27 {

	public static void main(String[] args) {
		System.out.println("All the leap years from 101 to 2100:\n");

		int count = 0;
		for (int year = 101; year <= 2100; year++) {

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;

				System.out.print(year + (count % 10 == 0 ? "\n" : " "));
			}
		}

	}

}
