package chapters.chapter08;

public class Exercise08_22 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix();

        displayMatrix(matrix);

        System.out.println("Every row and every column have" + (checkMatrix(matrix) ? "" : " not") +
                " even number of 1s.");

    }

    public static int[][] generateMatrix() {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkMatrix(int[][] matrix) {
        return (checkRowOfMatrix(matrix) && checkColumnOfMatrix(matrix));
    }

    public static boolean checkRowOfMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumnOfMatrix(int[][] matrix) {

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
