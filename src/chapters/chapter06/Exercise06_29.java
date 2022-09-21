package chapters.chapter06;

public class Exercise06_29 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isTwinPrime(i)) {
                System.out.println("(" + i + " , " + (i + 2) + ")");

            }
        }
    }

    public static boolean isTwinPrime(int number) {
        if (Exercise06_27.isPrime(number) && Exercise06_27.isPrime(number + 2)) {
            return true;
        }
        return false;
    }


}
