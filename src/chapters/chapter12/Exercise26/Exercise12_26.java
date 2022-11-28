package chapters.chapter12.Exercise26;

import java.io.File;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        File dir = new File(input.next());

        if (dir.exists()) {
            System.out.println("Directory already exists");
            System.exit(0);
        }

        if (dir.mkdirs()) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Directory has not created successfully !!");
        }
    }
}
