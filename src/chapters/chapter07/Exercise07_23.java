package chapters.chapter07;

public class Exercise07_23 {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 100;
        boolean[] locker = new boolean[NUMBER_OF_STUDENTS];

        for (int s = 0; s < locker.length; s++) {
            for (int l = s; l < locker.length; l += s + 1) {
                locker[l] = !locker[l];
            }
        }
        System.out.println("The open lockers are:");
        for (int i = 0; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
