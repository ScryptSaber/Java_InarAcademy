package chapters.chapter10.Exercise20;

import java.math.BigDecimal;

public class Exercise10_20 {
    public static void main(String[] args) {
        System.out.println("\n The e values for i = 100 to 1000:");
        System.out.println(" i                e");
        System.out.println("-----------------------------------");
        for (BigDecimal i = new BigDecimal("100"); i.compareTo(new BigDecimal("1000")) <= 0; i = i.add(new BigDecimal("100"))) {
            System.out.println(i + "    " + getE(i));
        }
    }

    public static BigDecimal getE(BigDecimal v) {
        BigDecimal e = new BigDecimal("1.0");

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(v) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal denominator = factorial(i);

            e = e.add(BigDecimal.ONE.divide(denominator, 25, BigDecimal.ROUND_UP));
        }
        return e;
    }

    public static BigDecimal factorial(BigDecimal i) {
        BigDecimal result = BigDecimal.ONE;
        for (BigDecimal j = BigDecimal.ONE; j.compareTo(i) <= 0; j = j.add(BigDecimal.ONE)) {
            result = result.multiply(j);
        }
        return result;
    }
}
