package chapters.chapter07;

public class Exercise07_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        int key = array[(int) (Math.random() * 100000)];

        long startTime = System.currentTimeMillis();
        System.out.println("The key is in the " + linearSearch(array, key) + ".index");
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("With Linear search the key has been found in " + executionTime + " milliseconds");

        startTime = System.currentTimeMillis();
        sort(array);
        System.out.println("The key is in the " + binarySearch(array, key) + ".index");
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("With Binary search the key has been found in " + executionTime + " milliseconds");


    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key == array[mid]) {
                return mid;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static int[] sort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int swapIndex = i;
            int low = numbers[i];
            for (int k = i + 1; k < numbers.length; k++) {

                if (low > numbers[k]) {
                    low = numbers[k];
                    swapIndex = k;
                }
            }
            if (swapIndex != i) {
                numbers[swapIndex] = numbers[i];
                numbers[i] = low;
            }

        }
        return numbers;
    }
}
