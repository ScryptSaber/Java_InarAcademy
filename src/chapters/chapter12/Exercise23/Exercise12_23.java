package chapters.chapter12.Exercise23;

import java.net.URL;
import java.util.Scanner;

public class Exercise12_23 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the URL : ");
        String urlString = input.next();

        double sum = 0;
        int count = 0;
        URL url = new URL(urlString);

        try (
                Scanner input2 = new Scanner(url.openStream())
        ) {
            while (input2.hasNext()) {
                sum += input.nextDouble();
                count++;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average: " + (sum / count));
    }
}
