package chapters.chapter11.Exercise02;

import chapters.chapter10.Exercise14.MyDate;

public class Exercise11_02 {
    public static void main(String[] args) {
        Person person = new Person("Erdem", "Hava Harp",
                "9999999999", "erdem@hho.edu.tr");

        Student student = new Student("Erkam", "Ankara Pursaklar", "333333333",
                "erkam0@gmail.com", Student.FRESHMAN);

        Employee employee = new Employee("Berk", "İstanbul", "6666666666",
                "berk0@orman.com", 910, 60000, new MyDate());

        Faculty faculty = new Faculty("Ada", "Texas, Dallas", "4133333333",
                "ada@lovelance.com", 101, 50000, new MyDate(), "10am to 6pm", "manager");

        Staff staff = new Staff("Elon ", "California", "2030222220",
                "elon@musk.com", 12, 6005000, new MyDate(), "CEO");

        System.out.println("   _Person_ ");
        System.out.println(person);

        System.out.println("   _Student_ ");
        System.out.println(student);

        System.out.println("   _Employee_ ");
        System.out.println(employee);

        System.out.println(faculty);
        System.out.println(staff);
    }
}
