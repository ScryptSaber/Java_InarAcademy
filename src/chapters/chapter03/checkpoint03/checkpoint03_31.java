package chapters.chapter03.checkpoint03;

public class checkpoint03_31 {
	public static void main(String[] args) {
		int x = 1, a = 3;
		
		// first version with an if-else statement
		if (a == 1)
			x += 5;
		else if (a == 2)
			x += 10;
		else if (a == 3)
			x += 16;
		else if (a == 4)
			x += 34;

		System.out.println("After if-else x = " + x);
		
		x = 1;	// set x to original value before switch statement
		
		// second version with a switch statement
		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		case 4:
			x += 34;
			break;
		}
		
		System.out.println("After switch x = " + x);
	}

}
