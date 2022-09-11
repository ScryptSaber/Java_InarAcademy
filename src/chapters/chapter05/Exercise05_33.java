package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_33 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 10000; i++) {
			sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}

			if (sum == i) {
				System.out.println("Perfect numbers are " + i);

			}
		}

	}

}
