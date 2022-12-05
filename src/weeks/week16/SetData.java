package weeks.week16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetData {
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
        list.add(2);
        System.out.println(list);

        System.out.println("Unique values:");
        Set set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set);
    }
}
