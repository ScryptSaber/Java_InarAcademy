package chapters.chapter06;

public class Exercise06_28 {
    public static void main(String[] args) {
        int n = 31;
        System.out.println("p         2^p-1");
        System.out.println("---------------");
        printMersennePrimes(31);
    }

    public static boolean isMersenne(int number) {
        if (Exercise06_27.isPrime((int) (Math.pow(2, number)) - 1)) {
            return true;
        }
        return false;
    }

    public static void printMersennePrimes(int n) {
        int count = 1;
        int number = 2;
        while (count <= n) {
            if (Exercise06_27.isPrime(number) && isMersenne(number)) {
                if (count % 10 == 0) {
                    System.out.println();
                }
                System.out.printf("%-10d%-10d\n", number, (int) Math.pow(2, number) - 1);
                count++;
            }
            number++;
        }
    }


}


