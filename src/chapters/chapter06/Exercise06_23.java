package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.print("Enter char:");
        String c = input.next();

        System.out.print("Number Of Occurences " + count(s, c.charAt(0)));

    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;

            }
        }
        return count;
    }
}
