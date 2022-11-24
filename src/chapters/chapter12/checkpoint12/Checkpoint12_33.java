package chapters.chapter12.checkpoint12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Checkpoint12_33 {
    public static void main(String[] args) throws IOException {
        File f = new File("temp.txt");
        if (!f.exists()) {
            System.out.println("There isn't any file like that.");
            System.exit(0);
        }
        Scanner input = new Scanner(f);
        while (input.hasNext()) {
            String s1 = input.next();
            String s2 = input.next();
            String s3 = input.next();
            String s4 = input.next();
            String s5 = input.next();
            System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 + " ");

        }
        input.close();
    }
}
