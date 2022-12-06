package chapters.chapter21.arraylist;

import java.io.File;
import java.util.*;

public class Exercise20_01_ArrayList {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise_20_01 TextFile");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file " + args[0] + " does not exist.");
            System.exit(2);
        }

        List<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String[] array = input.nextLine().split(" ");

                for (int i = 0; i < array.length; i++) {
                    if (array[i].length() > 0 && Character.isLetter(array[i].charAt(0))) {
                        list.add(array[i]);
                    }
                }
            }
        }
        Collections.sort(list);

        System.out.println(list);
    }
}
