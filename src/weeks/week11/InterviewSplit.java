package weeks.week11;

import java.util.Arrays;

public class InterviewSplit {
    public static void main(String[] args) {
        String cv = "I know java.My level at java is mid-level.I use java in Selenium.";
        String word ="java";

        String[] arr = cv.split(word);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length-1);


        //Second way.I solved it with ,one by one search
        System.out.println();
        int count = 0;
        for (int i = 0; i < cv.length()-word.length(); i++) {
            if ((cv.toLowerCase().charAt(i) == 'j') && (cv.toLowerCase().charAt(i + 1) == 'a') &&
                    (cv.toLowerCase().charAt(i + 2) == 'v') && (cv.toLowerCase().charAt(i + 3) == 'a')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
