package chapters.chapter21.map;

import java.math.BigInteger;
import java.util.*;

public class Exercise07_03_Map {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int num = input.nextInt();
        while (num != 0) {
            list.add(num);
            num = input.nextInt();
        }

        for (int j = 0; j < list.size(); j++) {
            int n = list.get(j);

            if (list.contains(n)) {
                if (map.containsKey(n)) {
                    int number = map.get(n);
                    map.put(n, number + 1);
                } else {
                    map.put(n, 1);
                }
            }
        }
        print(map);

    }

    private static void print(Map map) {
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " occurs " + map.get(key) + " time");
        }
    }
}

