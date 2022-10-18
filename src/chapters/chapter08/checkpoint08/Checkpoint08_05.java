package chapters.chapter08.checkpoint08;

public class Checkpoint08_05 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}
