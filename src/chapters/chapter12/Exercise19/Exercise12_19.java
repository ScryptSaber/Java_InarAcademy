package chapters.chapter12.Exercise19;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String urlString = new Scanner(System.in).next();

        try {
            URL url = new URL(urlString);
            int wordCount = 0;
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String w = input.next();
                wordCount++;
            }
            System.out.println("The total word number is " + wordCount + " in " + urlString);

        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("I/O Errors : No such file");
        }
    }
}
