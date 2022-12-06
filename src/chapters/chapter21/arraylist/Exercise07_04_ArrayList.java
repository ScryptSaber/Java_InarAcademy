package chapters.chapter21.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07_04_ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countAverageAbove = 0;
        int countAverageBelow = 0;
        int sum = 0;
        int i = 0;

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the scores: ");
        while (true) {
            int e = input.nextInt();
            if (e < 0) {
                break;
            }
            list.add(e);
            sum += list.get(i);
            i++;
        }
        double average = sum / list.size();

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) >= average) {
                countAverageAbove++;
            } else {
                countAverageBelow++;
            }
        }
        System.out.println("Average of scores: " + average);
        System.out.println("Above or equal the average is " + countAverageAbove);
        System.out.println("Below the average is " + countAverageBelow);

    }
}
