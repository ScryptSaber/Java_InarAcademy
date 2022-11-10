package chapters.chapter10.Exercise17;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        long sqrt = (long) (Math.sqrt(Long.MAX_VALUE)) + 1;
        BigInteger num = new BigInteger(sqrt + "");

        System.out.println("LONG.MAX_VALUE is: " + Long.MAX_VALUE);

        System.out.println("The first ten square numbers that are greater than Long.MAX_VALUE :");
        for (int i = 0; i < 10; i++) {
            System.out.println(num.multiply(num));
            num = num.add(BigInteger.ONE);
        }
    }
}
