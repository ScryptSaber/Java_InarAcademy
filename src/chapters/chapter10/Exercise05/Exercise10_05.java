package chapters.chapter10.Exercise05;

import chapters.chapter10.listing10.StackOfIntegers;

import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int[] array = smallestFactor(number);
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

    public static int[] smallestFactor(int num) {
        int[] array = new int[10];
        int count = 0;
        int i = 2;
        while (num != 1) {
            if (num % i == 0) {
                array[count] = i;
                count++;
                num /= i;
            } else {
                i++;
            }
        }
        return array;
    }
}