package chapters.chapter21.map;

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
        for (int j = 0; j < 100; j++) {
            if (list.contains(j)) {
                if (map.containsKey(j)) {
                    int number = map.get(j);
                    map.put(j, number + 1);
                } else {
                    map.put(j, 1);
                }
            }
        }
        print(map);//There is a mistake here but i will fix it.

    }

    private static void print(Map map) {
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " occurs " + map.get(key) + " time");
        }

    }
}

