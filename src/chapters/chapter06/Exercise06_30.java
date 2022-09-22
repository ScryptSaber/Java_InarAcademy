package chapters.chapter06;

public class Exercise06_30 {
    public static void main(String[] args) {
        int dice1 = 1 + (int) (Math.random() * 6);
        int dice2 = 1 + (int) (Math.random() * 6);

        int sum = dice1 + dice2;

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);

        if (check(sum)) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }


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
                System.out.println("Point is " + point);

                while (true) {
                    int dice1 = 1 + (int) (Math.random() * 6);
                    int dice2 = 1 + (int) (Math.random() * 6);
                    int total = dice1 + dice2;
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));

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
