package chapters.chapter21.map;

import java.util.*;

public class Exercise_Map_Sort_Keys {
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

        List keys=new ArrayList(map.keySet());
        Collections.sort(keys);

        for (Object key : keys) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}

