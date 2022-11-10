package chapters.chapter10.Exercise16;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("1");
        for (int i = 1; i < 50; i++) {
            s.append("0");
        }
        int count = 0;
        BigInteger n = new BigInteger(String.valueOf(s));
        BigInteger divisor2 = new BigInteger("2");
        BigInteger divisor3 = new BigInteger("3");
        BigInteger zero = new BigInteger("0");

        while (count < 10) {
            if (zero.compareTo(n.remainder(divisor2)) == 0 || zero.compareTo(n.remainder(divisor3)) == 0) {
                System.out.println(n);
                count++;
            }
            n = n.add(BigInteger.ONE);
        }
    }
}
