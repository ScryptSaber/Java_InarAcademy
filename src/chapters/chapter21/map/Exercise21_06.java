package chapters.chapter21.map;

import java.util.*;

public class Exercise21_06 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of integers(Input ends when the input is 0):");
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

        int max = Collections.max(map.values());

        System.out.print("The most occurrences integers are: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
            
        }
    }
}
