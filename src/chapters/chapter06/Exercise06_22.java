package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n : ");
        long num = input.nextLong();
        System.out.println("The approximated square root of " + num + " is: " + sqrt(num));
    }

    public static double sqrt(long n) {
        long lastGuess = 1;
        long nextGuess = 2;

        while (nextGuess - lastGuess > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;

        }
        lastGuess = nextGuess;
        return nextGuess = (lastGuess + n / lastGuess) / 2;
    }

}
