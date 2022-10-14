package chapters.chapter07;

import java.util.Scanner;

public class Exercise07_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playStarts = 'y';

        while (playStarts == 'y') {
            String[] words = {"write", "lacasadepapel", "program", "erdem", "metu", "java", "selenium", "scryptsaber",};
            int random = (int) (Math.random() * words.length);
            String theWord = words[random];
            char[] star = new char[theWord.length()];

            for (int i = 0; i < star.length; i++) {
                star[i] = '*';
            }
            int missTime = 0;

            while (true) {
                System.out.print("(Guess) Enter a Letter in word ");

                for (int i = 0; i < star.length; i++) {

                    System.out.print(star[i]);
                }
                System.out.print(" > ");
                char guess = input.next().charAt(0);

                missTime += checkLetter(star, guess, theWord);

                if (checkAllAnswer(star, theWord)) {
                    break;
                }
            }
            displayResults(theWord, missTime);

            System.out.print("Do you want to guess another word? Enter y or n > ");
            playStarts = input.next().charAt(0);
        }
    }

    public static int checkLetter(char[] star, char guess, String theWord) {
        int c = 0;
        if (isAlreadythere(guess, star)) {
            System.out.println(guess + " is already in the word");
        }
        for (int i = 0; i < star.length; i++) {
            if (theWord.charAt(i) == guess) {
                star[i] = theWord.charAt(i);
                c++;
            }
        }
        if (c > 0) {
            return 0;
        }
        System.out.println(guess + " is not in the word");
        return 1;
    }

    public static boolean checkAllAnswer(char[] star, String theWord) {
        for (int i = 0; i < star.length; i++) {
            if (star[i] != theWord.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlreadythere(char guess, char[] star) {
        for (int i = 0; i < star.length; i++) {
            if (star[i] == guess) {
                return true;
            }
        }
        return false;
    }

    public static void displayResults(String theWord, int missTime) {
        System.out.print("\nThe word is " + "\"" + theWord + "\". ");
        if (missTime == 0) {
            System.out.println("You didn't miss");
        } else if (missTime == 1) {
            System.out.println("You missed " + missTime + " time");
        } else {
            System.out.println("You missed " + missTime + " times");
        }
    }
}
