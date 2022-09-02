package weeks.week03;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter age of 3 people: ");
		int p1 = input.nextInt();
		int p2 = input.nextInt();
		int p3 = input.nextInt();
		
		int temp;
		if( p1 > p2) {
			temp=p1;
			p1=p2;
			p2=temp;
		}
		if (p2 > p3) {
			temp=p2;
			p2=p3;
			p3=temp;
		}
		if (p1 > p3) {
			temp=p1;
			p1=p3;
			p3=temp;
		}
System.out.println("descending age order is " + p1 + " "+ p2 + " " + p3);
	}

}
