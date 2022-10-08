package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(array);
        System.out.print("The distinct numbers are: ");
        for (int e : distinct) {
            if (e > 0) {
                System.out.print(e + " ");
            }
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int index = 0;
        int[] a = new int[10];

        for (int i = 0; i < list.length; i++) {
            boolean isDublicate = false;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    isDublicate = true;
                }
            }
            if (!isDublicate) {
                a[index] = list[i];
                index++;
            }
        }
        return a;
    }
}
