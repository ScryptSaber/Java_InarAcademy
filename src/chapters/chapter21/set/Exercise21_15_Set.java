package chapters.chapter21.set;

import java.util.*;

public class Exercise21_15_Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set answers = new HashSet<>();

        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int result;

        while (true) {
            System.out.print("What is " + num1 + " +" + num2 + " ? ");
            result = input.nextInt();
            if (result == num1 + num2) {
                System.out.println("You got it!");
                break;
            } else {
                System.out.println("Wrong answer. Try again.");

                if (answers.contains(result)) {
                    System.out.println("You already entered " + result);
                }
                answers.add(result);
            }
        }
    }
}
