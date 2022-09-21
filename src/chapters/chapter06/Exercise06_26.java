package chapters.chapter06;

public class Exercise06_26 {
    public static void main(String[] args) {

        int n = 100;
        System.out.println("The first " + n + " Palindromic Prime Numbers are :");
        printPalindromicPrimeNumbers(n);
    }

    public static void printPalindromicPrimeNumbers(int n) {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPalindrome(number)) {
                if (count % 10 == 0) {
                    System.out.println();
                }
                System.out.printf("%-8d", number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrome(int number) {

        if (isPrime(number)) {
            int spare = number;
            int k = 0;
            int reverse = 0;

            while (number > 0) {
                k = number % 10;
                reverse = reverse * 10 + k;
                number /= 10;
            }
            if (spare == reverse) {
                return true;
            }
        }
        return false;
    }
}
