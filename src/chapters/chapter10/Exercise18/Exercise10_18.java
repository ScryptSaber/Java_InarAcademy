package chapters.chapter10.Exercise18;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");

        number = number.add(BigInteger.ONE);
        int count = 0;
        while (count < 5) {
            if (isPrime(number)) {
                count++;
                System.out.println(number);
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isPrime(BigInteger n) { // for(int d=2;d<=n/2;d=d+1)
        for (BigInteger d = new BigInteger("2"); d.compareTo(n.divide(new BigInteger("2"))) <= 0; d = d.add(BigInteger.ONE)) {
            if (n.remainder(d).compareTo(new BigInteger("0")) == 0) {// if(n%i==0)
                return false;
            }
        }
        return true;
    }
}
