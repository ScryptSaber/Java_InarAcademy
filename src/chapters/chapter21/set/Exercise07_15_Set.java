package chapters.chapter21.set;

import java.util.*;

public class Exercise07_15_Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        Set set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }

        System.out.println("The distinct numbers are: " + set);
    }
}
