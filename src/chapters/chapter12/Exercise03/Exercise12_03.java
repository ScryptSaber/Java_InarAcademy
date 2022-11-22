package chapters.chapter12.Exercise03;

import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i < args.length; i++) {
            array[i] = (int) Math.random() * 100;
        }
        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println("You chose: " + array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds.!!");
        }
    }
}
