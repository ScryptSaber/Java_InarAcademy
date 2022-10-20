package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] array = createArrayWithRandomValues(size);
        displayArray(array);

        displayRowControl(array);
        // TODO displayColumnControl(array);
       // TODO displayMajorDiagonalControl(array);
        //TODO displaySubDiagonalControl(array);


    }

    public static int[][] createArrayWithRandomValues(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void displayRowControl(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            boolean isSameRow = true;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][0] != m[i][j]) {
                    isSameRow = false;
                }
            }
            if (isSameRow) {
                System.out.println("All " + m[i][0] + "s on row " + i);
                count++;
            }
        }
        if(count==0){
            System.out.println("No same numbers on a row");
        }


    }

}
