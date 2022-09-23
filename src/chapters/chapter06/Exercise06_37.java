package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its width: ");
        int n = input.nextInt();
        int w = input.nextInt();
        System.out.println(format(n, w));
    }

    public static String format(int number, int width) {
        String s = number + "";
        String a = "";

        if (s.length() > width) {
            return s;
        } else {
            for (int i = 0; i < width - s.length(); i++) {
                a += "0";
            }
        }
        return a + s;
    }
}
