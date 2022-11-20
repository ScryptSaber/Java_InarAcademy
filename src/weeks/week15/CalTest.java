package weeks.week15;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        Number n1 = new Number(input.nextInt());
        Number n2 = new Number(input.nextInt());

        System.out.print("Enter calculation operator: ");
        String c = input.next();

        switch (c) {
            case ("sum"):
                print(Calculator.sum(n1, n2));
                break;
            case ("subtract"):
                print(Calculator.subtract(n1, n2));
                break;
            case ("multiply"):
                print(Calculator.multiply(n1, n2));
                break;
            case ("divide"):
                print(Calculator.divide(n1, n2));
                break;
            case ("mod"):
                print(Calculator.mod(n1, n2));
                break;
            default:
                System.out.println("No operation like that !!");
        }
    }

    public static void print(Number n3) {
        System.out.println("After calculation the number is " + n3.getValue());
    }
}

