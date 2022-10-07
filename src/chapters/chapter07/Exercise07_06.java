package chapters.chapter07;

public class Exercise07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;

        int[] primeNumbers = new int[NUMBER_OF_PRIMES];
        int index = 0;
        int num = 2;
        while (index < NUMBER_OF_PRIMES) {
            if (isPrime(num)) {
                primeNumbers[index] = num;
                index++;
            }
            num++;
        }

        printPrimeNumbers(primeNumbers, 10);
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers(int[] array, int numberPerLine) {

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%4d ", array[i]);
            if ((i + 1) % numberPerLine == 0) {
                System.out.println("");
            }
        }
    }
}
