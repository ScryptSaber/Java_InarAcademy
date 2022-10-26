package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eter nmber n: ");
        int n = input.nextInt();
        char[][] list = new char[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print((char)('A'+j) + " ");
            }
            System.out.println();
        }
    }
}
