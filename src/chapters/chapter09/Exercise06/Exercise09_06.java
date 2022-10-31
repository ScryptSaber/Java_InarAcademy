package chapters.chapter09.Exercise06;

public class Exercise09_06 {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int[] randomArray = getRandomNumbers();

        stopwatch.start();
        selectionSort(randomArray);
        stopwatch.stop();

        System.out.println("The execution  time of sorting 100,000 " + "numbers using selection sort: "
                + stopwatch.getElapsedTime() + " milliseconds");

    }

    public static int[] getRandomNumbers() {
        int[] randomArray = new int[100_000];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100_000);
        }
        return randomArray;
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
}
