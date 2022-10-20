package chapters.chapter08;

import java.util.Scanner;

public class Exercise08_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number between 0 and 511: ");
        int num = input.nextInt();
        String s = Integer.toBinaryString(num);
        String b = "";

        for(int i=0;i<9-s.length();i++){
            b+="0";
        }
        String binary= b+s;
        System.out.println(binary);

        int a = 0;
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {

               System.out.print((binary.charAt(a)=='1' ? "T" : "H") + " ");
               a++;
           }
           System.out.println();
        }
    }
}
