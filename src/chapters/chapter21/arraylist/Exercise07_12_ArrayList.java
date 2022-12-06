package chapters.chapter21.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise07_12_ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List list = new ArrayList<>();
        System.out.print("Enter 10 Numbers: ");

        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        printReverse(list);
    }

    public static void printReverse(List list) {
        List list2 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        System.out.println("List: " + list);
        System.out.println("Reversed list: " + list2);
    }
}
