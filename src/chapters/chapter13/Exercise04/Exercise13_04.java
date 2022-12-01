package chapters.chapter13.Exercise04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise13_04 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java Exercise13_04 month year");
            System.exit(1);
        }
        Calendar c = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);

        printHeader(c);

        for (int i = 1; i < c.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.print("    ");
        }

        while (c.get(Calendar.DATE) < c.getActualMaximum(Calendar.DATE)) {
            if (c.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.printf("%4d\n", c.get(Calendar.DATE));
            } else {
                System.out.printf("%4d", c.get(Calendar.DATE));
            }
            c.add(Calendar.DATE, 1);
        }
        System.out.printf("%4d\n", c.get(Calendar.DATE));
    }

    public static void printHeader(Calendar calendar) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        System.out.print("\n       ");
        System.out.println(months[calendar.get(Calendar.MONTH)] + ", " + calendar.get(Calendar.YEAR));

        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
}
