package chapters.chapter10.Exercise06;

import chapters.chapter10.listing10.StackOfIntegers;

import java.util.Scanner;

public class Exercise10_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int[] array = findPrimes(number);
        StackOfIntegers stack = new StackOfIntegers();

        System.out.print("Decreasing order: ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
                stack.push(array[i]);
            }
        }

        System.out.print("\nWe used pop() method: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static int[] findPrimes(int n) {
        int[] array = new int[130];
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                array[count] = number;
                count++;
            }
            number++;
        }
        return array;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
