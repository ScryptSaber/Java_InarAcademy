package chapters.chapter06;

public class Exercise06_32 {
    public static void main(String[] args) {
        int win = 0;
        int lose = 0;

        for (int i = 0; i < 10000; i++) {
            int sum = rollDice();

            if (check(sum)) {
                win++;
            } else {
                lose++;
            }
        }
        System.out.println(win + " times winning, " + lose + " times losing");
    }

    public static int rollDice() {
        int dice1 = 1 + (int) (Math.random() * 6);
        int dice2 = 1 + (int) (Math.random() * 6);

        return dice1 + dice2;
    }

    public static boolean check(int sum) {
        int point;
        switch (sum) {
            case 2:
            case 3:
            case 12:
                return false;
            case 7:
            case 11:
                return true;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                point = sum;

                while (true) {
                    int total = rollDice();

                    if (point == total) {
                        return true;
                    }
                    if (total == 7) {
                        return false;
                    }
                }
        }
        return false;
    }
}
