package chapters.chapter13.Exercise02;

import java.util.ArrayList;

public class Exercise13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(1.5);
        list.add(10);
        list.add(1.53);
        list.add(5);
        list.add(12.5);
        list.add(65);

        System.out.println("Before shuffle..\n" + list.toString());
        shuffle(list);
        System.out.println("After shuffle..\n" + list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}
