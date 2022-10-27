package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] array = getNames();

        int count = 0;
        int i = 0;
        while (i < array.length) {
            System.out.println("What is the capital of " + array[i][0]);
            String answer = input.next();

            if (checkAnswer(array, i, answer)) {
                System.out.println("Your answer is correct");
                count++;
            } else {
                System.out.println("The correct answer should be " + array[i][1]);
            }
            i++;
        }
        System.out.println("The correct count is " + count);
    }

    public static boolean checkAnswer(String[][] array, int i, String answer) {
        String capital = array[i][1];
        if (answer.length() != capital.length())
            return false;

        for (int a = 0; a < answer.length(); a++) {
            if (answer.toLowerCase().charAt(a) != capital.toLowerCase().charAt(a)) {
                return false;
            }
        }
        return true;
    }

    public static String[][] getNames() {
        String[][] array = new String[5][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the state and capital:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.next();
            }
        }
        return array;
    }
}
