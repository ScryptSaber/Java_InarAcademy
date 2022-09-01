package chapters.chapter04.checkpoint04;

public class checkpoint04_24 {

	public static void main(String[] args) {
		System.out.println("(a)"); 
		System.out.printf("amount is %f %e\n", 32.32, 32.32);
	    System.out.println();
	    
	    System.out.println("(b)");
		System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
		System.out.println();
		    
		System.out.println("(c)");
		System.out.printf("%6b\n", (1 > 2));
		System.out.println();
		    
		System.out.println("(d)");
		System.out.printf("%6s\n", "Java");
		System.out.println();
		    
		System.out.println("(e)");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.println();
		    
		System.out.println("(f)");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
		System.out.println();
		    
		System.out.println("(g)");
		System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
		System.out.println();
		    
		System.out.println("(h)");
		System.out.printf("%05d %06.1f\n", 32, 32.32);
	}

}
