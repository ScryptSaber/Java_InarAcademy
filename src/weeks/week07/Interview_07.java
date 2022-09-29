package weeks.week07;

import java.util.Scanner;

public class Interview_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = input.next();

        if (isUnique(s)) {
            System.out.println(s + " is Unique.");
        } else {
            System.out.println(s + " is not Unique.");
        }
    }

    public static boolean isUnique(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
