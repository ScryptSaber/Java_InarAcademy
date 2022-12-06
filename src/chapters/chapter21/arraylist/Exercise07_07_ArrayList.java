package chapters.chapter21.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercise07_07_ArrayList {
    public static void main(String[] args) {
        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            count.add(0);
        }

        for (int i = 0; i < 100; i++) {
            int num = generateRandomNumber();
            count.set(num, count.get(num) + 1);
        }

        for (int i = 0; i < count.size(); i++) {
            System.out.println(i + "s : " + count.get(i) + " times");
        }
    }
    private static int generateRandomNumber() {
        int num = (int) (Math.random() * 10);
        return num;
    }

}
