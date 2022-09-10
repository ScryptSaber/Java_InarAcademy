package chapters.chapter05;

import java.util.Scanner;

public class Exercise05_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter the day (for Sunday 0,Monday 1..etc.) : ");
		int day = input.nextInt();
		
		
		for(int i =1; i<=12; i++) {
			switch(i) {
			case 1:System.out.print("\nJanuary 1," + year + " is " );d(day);break;
				
			case 2:System.out.print("February 1," + year +" is "  );d((day +31)%7);day =(day +31)%7;break;
					
			case 3:System.out.print("March 1," + year +" is ");
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					d((day +29)%7);day =(day +29)%7;break;
				}else {
					d((day +28)%7);day =(day +28)%7;break;
				}
			case 4:System.out.print("April 1," + year +" is ");d((day +31)%7);day =(day +31)%7;break;
			
			case 5:System.out.print("May 1," + year +" is ");d((day +30)%7);day =(day +30)%7;break;
			
			case 6:System.out.print("June 1," + year +" is ");d((day +31)%7);day =(day +31)%7;break;
			
			case 7:System.out.print("July 1," + year +" is ");d((day +30)%7);day =(day +30)%7;break;
			
			case 8:System.out.print("August 1," + year +" is ");d((day +31)%7);day =(day +31)%7;break;
			
			case 9:System.out.print("Septembre 1," + year +" is ");d((day +31)%7);day =(day +31)%7;break;
			
			case 10:System.out.print("October 1," + year +" is ");d((day +30)%7);day =(day +30)%7;break;
			
			case 11:System.out.print("November 1," + year +" is ");d((day +31)%7);day =(day +31)%7;break;
			
			case 12:System.out.print("December 1," + year +" is ");d((day +30)%7);break;
			
			
			}
		}
	}
	
	public static void d(int a) {
		switch(a) {
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday"); break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		
		}	
		
		
	}
	
	}

