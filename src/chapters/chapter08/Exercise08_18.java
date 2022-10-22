package chapters.chapter08;


public class Exercise08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        displayShuffledArray(m);
    }

    public static void shuffle(int[][] m) {
        int[] temp;
        for (int i = 0; i < m.length; i++) {
            int index = (int) (Math.random() * m.length);
            temp = m[i];
            m[i] = m[index];
            m[index] = temp;
        }
    }

    public static void displayShuffledArray(int[][] m) {
        System.out.println("Shuffled array :");
        System.out.print("{");
        for (int i = 0; i < m.length; i++) {
            System.out.print("{" + m[i][0] + ", " + m[i][1] + "}");
            System.out.print((i == m.length - 1) ? "}" : ", ");
        }
        System.out.println();
    }
}
