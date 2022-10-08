package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("gcd is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        boolean isDivisor;
        int min = getMin(numbers);

        for (int i = 1; i <= min; i++) {
            isDivisor = true;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % i != 0) {
                    isDivisor = false;
                }
            }
            if (isDivisor) {
                gcd = i;
            }
        }
        return gcd;
    }

    private static int getMin(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
