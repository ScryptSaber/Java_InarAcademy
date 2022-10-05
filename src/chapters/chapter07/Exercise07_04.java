package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countAverageAbove = 0;
        int countAverageBelow = 0;
        int sum = 0;
        int numberOfScores = 0;
        int[] array = new int[100];

        System.out.print("Enter the scores: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] < 0) {
                break;
            }
            sum += array[i];
            numberOfScores++;
        }
        double average = sum / numberOfScores;

        for (int j = 0; j < numberOfScores; j++) {
            if (array[j] >= average) {
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
