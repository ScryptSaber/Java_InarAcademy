package chapters.chapter13.Exercise15;

import java.math.BigInteger;

public class Rational extends Number implements Comparable {
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE :
                new BigInteger("-1")).multiply(numerator.divide(gcd));
        this.denominator = denominator.divide(gcd);
    }


    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n;
        BigInteger n2 = d;
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
            if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0 && n2.remainder(k).compareTo(BigInteger.ZERO) == 0) {
                gcd = k;
            }
        }
        return gcd;
    }

    public BigInteger getNumerator() {
        return this.numerator;
    }

    public BigInteger getDenominator() {
        return this.denominator;
    }

    public Rational add(Rational secondRational) {
        BigInteger n = (this.numerator.multiply(secondRational.getDenominator())).add(
                this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = (this.numerator.multiply(secondRational.getDenominator())).subtract(
                this.denominator.multiply(secondRational.getNumerator()));
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }


    public Rational multiply(Rational secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getNumerator());
        BigInteger d = this.denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }


    public Rational divide(Rational secondRational) {
        BigInteger n = this.numerator.multiply(secondRational.getDenominator());
        BigInteger d = this.denominator.multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (this.denominator.compareTo(BigInteger.ONE) == 0) {
            return this.numerator + "";
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (((this.subtract((Rational) (other))).getNumerator()).compareTo(BigInteger.ZERO) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Object o) {
        BigInteger zero = BigInteger.ZERO;
        BigInteger n = this.subtract((Rational) o).getNumerator();
        if (n.compareTo(zero) > 0) {
            return 1;
        } else if (n.compareTo(zero) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
