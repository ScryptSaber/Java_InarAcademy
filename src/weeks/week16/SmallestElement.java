package weeks.week16;

import java.util.*;

public class SmallestElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(51);
        list.add(13);
        list.add(35);
        list.add(533);
        list.add(55);
        list.add(55);
        list.add(2);
        System.out.println(list);

        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                index = i;
            }
        }
        System.out.println("min:" + min);
        System.out.println("min index: " + index);
    }
}
