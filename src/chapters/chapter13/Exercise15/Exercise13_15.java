package chapters.chapter13.Exercise15;

import java.math.BigInteger;

public class Exercise13_15 {
    public static void main(String[] args) {
        Rational r1 = new Rational(new BigInteger("50000000"), new BigInteger("60000000"));
        Rational r2 = new Rational(new BigInteger("20000000"), new BigInteger("80000000"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
