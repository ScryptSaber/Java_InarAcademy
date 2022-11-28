package chapters.chapter12.Exercise29;

import java.io.File;

public class Exercise12_29 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_29 *");
            System.exit(1);
        }

        for (String s : args) {
            File file = new File(s);
            StringBuilder sb1 = new StringBuilder(s);

            if (s.matches("Exercise\\d_\\d.*")) {
                int n = s.indexOf("_");
                sb1.insert(n + 1, 0);
            }

            File newName = new File(String.valueOf(sb1));
            file.renameTo(newName);
        }
    }
}
