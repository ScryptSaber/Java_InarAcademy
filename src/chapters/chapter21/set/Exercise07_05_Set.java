package chapters.chapter21.set;

import java.util.*;

public class Exercise07_05_Set {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        Set set = new HashSet<>();
        set.addAll(list);

        System.out.println("The number of distinct number is " + set.size());
        System.out.println(set);
    }

}
