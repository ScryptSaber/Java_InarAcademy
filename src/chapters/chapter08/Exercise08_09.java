package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] array = new String[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " ";

            }
        }

        displayTable(array);
        System.out.print("Enter a row (0, 1, or 2) for player X: ");
        int a = input.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player X: ");
        int b = input.nextInt();


    }

    public static void displayTable(String[][] m) {
        System.out.println("\n-------------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("|  " + m[i][j]);
            }
            System.out.println("|\n-------------");
        }
    }
}
