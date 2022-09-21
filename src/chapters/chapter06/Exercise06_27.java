package chapters.chapter06;

public class Exercise06_27 {
    public static void main(String[] args) {

        int n = 100;
        System.out.println("The first " + n + " Emirp Numbers are :");
        printEmirpNumbers(n);
    }

    public static void printEmirpNumbers(int n) {
        int count = 0;
        int number = 2;
        while (count < n) {
            if (!isPalindrome(number) && isEmirp(number)) {
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

        return false;
    }

    public static boolean isEmirp(int number) {
        int spare = number;
        int k = 0;
        int reverse = 0;

        while (number > 0) {
            k = number % 10;
            reverse = reverse * 10 + k;
            number /= 10;
        }
        if (isPrime(spare) && isPrime(reverse)) {
            return true;
        }

        return false;

    }
}
