package chapters.chapter12.listing12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Listing12_13_WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create a file
        PrintWriter output = new PrintWriter(file);

        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones");
        output.println(85);

        // Close the file
        output.close();
    }
}
