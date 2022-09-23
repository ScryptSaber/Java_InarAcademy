package chapters.chapter06;

public class Exercise06_38 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 100;
        final int CHARS_PER_LINE = 10;

        printRandomUpperCaseLetter(NUMBER_OF_CHARS, CHARS_PER_LINE);
        printRandomDigitCharacter(NUMBER_OF_CHARS, CHARS_PER_LINE);

    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static void printRandomUpperCaseLetter(int n, int line) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (count % line == 0) {
                System.out.println();
            } else {
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
            count++;
        }
    }

    public static void printRandomDigitCharacter(int n, int line) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (count % line == 0) {
                System.out.println();
            } else {
                System.out.print(getRandomUpperCaseLetter() + " ");
            }
            count++;
        }
    }
}