package chapters.chapter21.map;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Exercise_Map_Sort_Values {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(10, "Erdem");
        map.put(11, "Ali");
        map.put(103, "Sinan");
        map.put(121, "Mehmet");
        map.put(2, "Akif");
        map.put(92, "Ediz");
        map.put(78, "Kaan");
        map.put(56, "Erkan");
        map.put(34, "Yusuf");
        map.put(9, "Etka");

        List values=new ArrayList(map.values());
        Collections.sort(values);

        for (Object value : values) {
            System.out.println(value);
        }
    }
}
