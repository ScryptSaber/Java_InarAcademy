package chapters.chapter12.Exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers to sum: ");

        while (true) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("Sum of " + a + " + " + b + " is " + (a + b));
                break;
            } catch (InputMismatchException e) {
                System.out.println(e.toString() + "\nWrong input !! Please enter integer -->  ");
                input.next();
            }
        }
    }
}
