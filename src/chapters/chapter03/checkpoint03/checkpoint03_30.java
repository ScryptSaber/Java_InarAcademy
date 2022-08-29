package chapters.chapter03.checkpoint03;

public class checkpoint03_30 {
	public static void main(String[] args) {
		int x, y;

		x = 3;
		y = 3;
		switch (x + 3) {
		case 6:
			y = 1;
		default:
			y += 1;
		}
		System.out.println("After switch statement y = " + y);
		
		// rewrite switch to an equivalent if-else variant
		y = 3; 	// set y to original value
		if(x + 3 == 6)
			y = 1;
		y += 1;
		System.out.println("After if statement y = " + y);
	}

}
