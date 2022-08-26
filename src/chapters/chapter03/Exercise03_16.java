package chapters.chapter03;

import java.util.Scanner;

public class Exercise03_16 {

	public static void main(String[] args) {
		
			int width = (int) (-50 + (Math.random() * (100)) );
			int height = (int) (-100 + (Math.random() * (200)) );

			// Display coordinate
			System.out.print("Random coordinate in rectangle centered at (0,0)");
			System.out.println(" with width 100 and height 200: (" + width + ", " + height + ")");
		}

}
