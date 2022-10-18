package chapters.chapter08.checkpoint08;

public class Checkpoint08_06 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][0];
        System.out.println(sum);
    }
}
