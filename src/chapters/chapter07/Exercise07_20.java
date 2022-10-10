package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }
        selectionSorting(nums);
        for (double e : nums) {
            System.out.print(e + " ");
        }
    }

    public static void selectionSorting(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            double max = list[i];
            int maxIndex = i;

            for (int j = i-1; j >= 0; j--) {
                if (list[j] > max) {
                    max = list[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                list[maxIndex] = list[i];
                list[i] = max;
            }
        }

    }
}
