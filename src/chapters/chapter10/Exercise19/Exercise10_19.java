package chapters.chapter10.Exercise19;

import chapters.chapter10.Exercise18.Exercise10_18;

import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {
        System.out.println("p       2^p - 1");
                                                                     // for(int p=2;p<=100;p++)
        for (BigInteger p = new BigInteger("2"); p.compareTo(new BigInteger("100")) <= 0; p = p.add(BigInteger.ONE)) {

            if (Exercise10_18.isPrime(p)) {
                System.out.printf("%-3d", p);
                System.out.println("       " + mersennePrime(p));
            }
        }
    }

    public static BigInteger mersennePrime(BigInteger n) {
        BigInteger two = new BigInteger("2");
        BigInteger x = new BigInteger("2");
                                                                        //for(int i=1;i<n;i++)
        for (BigInteger i = new BigInteger("1"); i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            x = x.multiply(two);
        }
        return x.subtract(BigInteger.ONE);
        
    }
}
