package chapters.chapter21.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise08_26_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(input.nextInt());
        row1.add(input.nextInt());
        row1.add(input.nextInt());

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(input.nextInt());
        row2.add(input.nextInt());
        row2.add(input.nextInt());

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(input.nextInt());
        row3.add(input.nextInt());
        row3.add(input.nextInt());

        list.add(row1);
        list.add(row2);
        list.add(row3);

        java.util.Collections.sort(row1);
        java.util.Collections.sort(row2);
        java.util.Collections.sort(row3);

        System.out.println("The row-sorted array is");
        for (ArrayList i : list) {
            System.out.println(i);
        }
    }
}
