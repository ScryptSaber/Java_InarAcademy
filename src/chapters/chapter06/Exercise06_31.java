package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long cardNumber = input.nextLong();

        System.out.println(cardNumber + " is " + (isValid(cardNumber) ? "valid" : "invalid"));
    }

    public static boolean isValid(long num) {
        boolean valid = (getSize(num) >= 13 && getSize(num) <= 16) &&
                        (prefixMatched(num, 4) || prefixMatched(num, 5)  ||
                        prefixMatched(num, 37) || prefixMatched(num, 6)) &&
                        ((sumOfDoubleEvenPlace(num) + sumOfOddPlace(num)) % 10 == 0);

        return valid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }
    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }
    public static int getDigit(int number) {
        if (number < 9)
            return number;
        else
            return number / 10 + number % 10;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }
}
