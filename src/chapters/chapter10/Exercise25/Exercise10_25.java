package chapters.chapter10.Exercise25;

import java.util.Arrays;

public class Exercise10_25 {
    public static void main(String[] args) {
        String str = "Java#inar#aca?demy";
        String[] array = split(str, "#?");

        System.out.println(Arrays.toString(array));
    }

    public static String[] split(String s, String regex) {
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < regex.length(); j++) {
                if (s.charAt(i) == regex.charAt(j)) {
                    size++;
                }
            }
        }
        String[] array = new String[size + 1];
        String str = "";
        int splitCount = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean check = true;
            for (int j = 0; j < regex.length(); j++) {
                if ((s.charAt(i) == regex.charAt(j))) {
                    check = false;
                }
            }

            if (check) {
                str += s.charAt(i);
            } else {
                array[splitCount] = str;
                splitCount++;
                str = "";
            }
        }
        array[splitCount] = str;
        return array;
    }
}
