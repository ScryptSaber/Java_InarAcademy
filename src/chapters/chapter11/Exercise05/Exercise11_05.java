package chapters.chapter11.Exercise05;

public class Exercise11_05 {
    public static void main(String[] args) {
        Course inar = new Course("Inar Academy SDET Course");

        inar.addStudent("Erdem Kamis");
        inar.addStudent("Erkam Imam");
        inar.addStudent("Sinan Cetin");
        inar.addStudent("Behlul Ersoz");
        inar.addStudent("Berk Orman");
        inar.addStudent("Tahir Gozuacik");
        inar.addStudent("Selim Kozan");

        System.out.println("After adding student to the course..");
        for (String s : inar.getStudents()) {
            System.out.print(s + " - ");
        }

        System.out.println("\nNumber of students: " + inar.getNumberOfStudents());
        System.out.println("------------------");

        inar.dropStudents("Erkam Imam");
        inar.dropStudents("Selim Kozan");
        inar.dropStudents("Ali Kaya");

        System.out.println("After dropping student from the course..");
        for (String s : inar.getStudents()) {
            System.out.print(s + " - ");
        }
        System.out.println("\nNumber of students: " + inar.getNumberOfStudents());
    }

}
