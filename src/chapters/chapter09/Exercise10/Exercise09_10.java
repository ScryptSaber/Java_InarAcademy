package chapters.chapter09.Exercise10;

import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        System.out.print("The equation has ");
        if (qe.getDiscriminant() < 0) {
            System.out.println("no real roots");
        } else if (qe.getDiscriminant() > 0) {
            System.out.printf("two roots %.3f and %.3f", qe.getRoot1(), qe.getRoot2());

        } else {
            System.out.println("one root " + (qe.getRoot1() > 0 ? qe.getRoot1() : qe.getRoot2()));
        }
    }
}
