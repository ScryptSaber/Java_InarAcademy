package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] zodiacs = {"Monkey", "Rooster", "Dog", "pig", "rat", "ox", "tiger",
                "rabbit", "dragon", "snake", "horse", "sheep"};


        System.out.print("Enter a year: ");
        int year = input.nextInt();


        System.out.println(year + " is year of " + zodiacs[year % 12] + " in zodiac");
    }
}
