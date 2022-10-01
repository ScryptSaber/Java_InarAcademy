package weeks.week07;

import java.util.Scanner;

public class Interview_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = input.next();

        System.out.println("Enter rotation string: ");
        String s2 = input.next();

        if (isRotated(s1, s2)) {
            System.out.println("It is true.");

        } else {
            System.out.println("It is false.");
        }


    }

    public static boolean isRotated(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }
}
