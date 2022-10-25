package chapters.chapter08;

public class Exercise08_16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(array);
        displayMatrix(array);
    }

    public static void sort(int m[][]) {
        int[] temp;
        for (int row = 0; row < m.length - 1; row++) {
            int min0 = m[row][0];
            int min1 = m[row][1];
            int minIndex = row;

            for (int i = row + 1; i < m.length; i++) {
                if (m[i][0] < min0 || (m[i][0] == min0 && m[i][1] < min1)) {
                    min0 = m[i][0];
                    min1 = m[i][1];
                    minIndex = i;

                }
            }
            if (minIndex != row) {
                temp = m[row];
                m[row] = m[minIndex];
                m[minIndex] = temp;
            }
        }
    }


    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("   ");
        }
    }
}
