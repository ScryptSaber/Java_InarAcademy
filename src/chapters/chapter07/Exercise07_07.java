package chapters.chapter07;

public class Exercise07_07 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] counts = new int[10];

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = (int) (Math.random() * 10);
            array[i] = num;
            counts[num]++;
        }
        System.out.println("Count for each number between 0 and 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
    }
}
