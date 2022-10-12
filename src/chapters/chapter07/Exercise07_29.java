package chapters.chapter07;

public class Exercise07_29 {
    public static void main(String[] args) {
        int[] deck = new int[4];
        int sum = 0;

        do {
            sum = 0;
            for (int i = 0; i < 4; i++) {
                deck[i] = 1 + (int) (Math.random() * 14);
                sum += deck[i];

            }
        } while (sum != 24);
        System.out.println("Sum is " + sum + "\nThe number of picks that yields The sum of 24: ");

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < 4; i++) {
            System.out.print(ranks[deck[i] - 1] + " ");

        }
    }

}
