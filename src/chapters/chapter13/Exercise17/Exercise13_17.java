package chapters.chapter13.Exercise17;

import java.util.Scanner;

public class Exercise13_17 {
    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.print("Enter the first complex number: ");
        Complex cn1 = getComplexFromUser();
        System.out.print("Enter the second complex number: ");
        Complex cn2 = getComplexFromUser();

        System.out.println(cn1 + " + " + cn2 + " = " + cn1.add(cn2));
        System.out.println(cn1 + " - " + cn2 + " = " + cn1.subtract(cn2));
        System.out.println(cn1 + " * " + cn2 + " = " + cn1.multiply(cn2));
        System.out.println(cn1 + " / " + cn2 + " = " + cn1.divide(cn2));
        System.out.println("|" + cn1 + "| = " + cn1.abs());
    }

    public static Complex getComplexFromUser() {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        return new Complex(n1, n2);
    }
}
