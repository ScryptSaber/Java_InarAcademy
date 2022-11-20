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
                Calculator.sum(n1, n2);
                break;
            case ("subtract"):
                Calculator.sum(n1, n2);
                break;
            case ("multiply"):
                Calculator.sum(n1, n2);
                break;
            case ("divide"):
                Calculator.sum(n1, n2);
                break;
        }
    }
}
