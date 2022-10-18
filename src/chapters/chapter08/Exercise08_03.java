package chapters.chapter08;


import java.util.Arrays;

public class Exercise08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] student = new int[8][2];

        for (int i = 0; i < answers.length; i++) {

            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            student[i][0] = i;
            student[i][1] = correctCount;
        }

        sort(student);
        System.out.println("Students in increasing order of the number of correct answers:\n");

        for (int row = 0; row < student.length; row++) {
            System.out.println("Student " + student[row][0] + "'s correct count is " + student[row][1]);
        }
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {

            int minCol1 = m[i][1];
            int minCol0 = m[i][0];
            int minIndex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (m[j][1] < minCol1) {
                    minCol1 = m[j][1];
                    minCol0 = m[j][0];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                m[minIndex][1] = m[i][1];
                m[minIndex][0] = m[i][0];
                m[i][1] = minCol1;
                m[i][0] = minCol0;
            }
        }
    }
}



