package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list:");
        int numberOfValues = input.nextInt();
        int[] array = new int[numberOfValues];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int partition = partitionSolve(array);
        System.out.println("Index of the pivot after the partition : " + partition);
    }

    public static int partitionSolve(int[] array) {
        int[] list = new int[array.length];
        int pivot = array[0];
        int high = array.length - 1;
        int low = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < pivot) {
                list[low] = array[i];
                low++;
            } else {
                list[high] = array[i];
                high--;
            }
        }
        list[low] = pivot;

        displayTheListAfterPartition(list);

        return (low);
    }

    public static void displayTheListAfterPartition(int[] list) {
        System.out.print("After the partition the list is : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
