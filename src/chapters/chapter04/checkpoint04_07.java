package chapters.chapter04;

public class checkpoint04_07 {

	public static void main(String[] args) {
		
		double a = Math.log(Math.exp(5.5));      
		
		double b = Math.exp(Math.log(5.5));    
		
		double c = Math.asin(Math.sin(Math.PI / 6));    
		
		double d = Math.sin(Math.asin(Math.PI / 6));    

		
		System.out.println(a+" "+ b +" "+ c+" "+ d);
	}

}
