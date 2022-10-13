package chapters.chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int firstOfList1 = input.nextInt();
        int[] list1 = new int[firstOfList1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int firstOfList2 = input.nextInt();
        int[] list2 = new int[firstOfList2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.print("The merged list is ");
        int[] mergedLists = merge(list1, list2);

        for (int i = 0; i < mergedLists.length; i++) {
            System.out.print(mergedLists[i] + " ");
        }

    }

    public static int[] merge(int[] list1, int[] list2) {
        int length = list1.length + list2.length;
        int[] list3 = new int[length];

        for (int i = 0; i < list1.length; i++) {
            list3[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            list3[i + list1.length] = list2[i];
        }
        Arrays.sort(list3);

        return list3;
    }
}
