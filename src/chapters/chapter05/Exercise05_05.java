package chapters.chapter05;

public class Exercise05_05 {

	public static void main(String[] args) {
		final double POUND_PER_KG = 2.2;

		System.out.println("Kilograms    Pounds    |    Pounds       Kilograms");
		
		for(int k = 1,p=20; k<=199 && p<=515; k+=2,p+=5) {
			
			
			System.out.printf("%-12d%7.1f", k, (k * POUND_PER_KG));
			
			System.out.print("    |    ");
			
			System.out.printf("%-10d%12.2f\n",p, (p / POUND_PER_KG));
			
		}
	}
		

}


