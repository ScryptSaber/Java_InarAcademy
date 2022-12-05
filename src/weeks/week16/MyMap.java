package weeks.week16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(10, 46);
        map.put(1, 97);
        map.put(2, 12);

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(map.get(key));
        }
        
    }
}
