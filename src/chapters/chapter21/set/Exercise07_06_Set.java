package chapters.chapter21.set;

import java.util.ArrayList;
import java.util.List;

public class Exercise07_06_Set {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        List list = new ArrayList<>();

        int index = 0;
        int num = 2;
        while (index < NUMBER_OF_PRIMES) {
            if (isPrime(num)) {
                list.add(num);
                index++;
            }
            num++;
        }

        printPrimeNumbers(list, 10);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(List list, int numberPerLine) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%4d ", list.get(i));
            if ((i + 1) % numberPerLine == 0) {
                System.out.println("");
            }
        }
    }
}
