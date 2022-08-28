package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1width = input.nextDouble();
		double r1height = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2width = input.nextDouble();
		double r2height = input.nextDouble();

		double r1LeftBorder = r1x - r1width / 2;
		double r1TopBorder = r1y + r1height / 2;
		double r1RightBorder = r1x + r1width / 2;
		double r1BottomBorder = r1y - r1height / 2;

		double r2LeftBorder = r2x - r2width / 2;
		double r2TopBorder = r2y + r2height / 2;
		double r2RightBorder = r2x + r2width / 2;
		double r2BottomBorder = r2y - r2height / 2;

		if (r1LeftBorder <= r2LeftBorder && r1TopBorder >= r2TopBorder && r1RightBorder >= r2RightBorder
				&& r1BottomBorder <= r2BottomBorder) {
			System.out.println("r2 is inside r1");
		} else if (r1LeftBorder > r2RightBorder || r1TopBorder < r2BottomBorder || r1RightBorder < r2LeftBorder
				|| r1BottomBorder > r2TopBorder) {
			System.out.println("r2 does not overlap r1");
		} else {
			System.out.println("r2 overlaps r1");
		}

	}

}
