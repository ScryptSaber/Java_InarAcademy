package chapters.chapter06;

import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.print(getNumber(Character.toUpperCase(s.charAt(i))));
            } else {
                System.out.print(s.charAt(i));
            }

        }
        System.out.println();
    }

    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter >= 'W') {
            return 9;
        } else if (uppercaseLetter >= 'T')
            return 8;
        else if (uppercaseLetter >= 'P')
            return 7;
        else if (uppercaseLetter >= 'M')
            return 6;
        else if (uppercaseLetter >= 'J')
            return 5;
        else if (uppercaseLetter >= 'G')
            return 4;
        else if (uppercaseLetter >= 'D')
            return 3;
        else
            return 2;

    }
}

