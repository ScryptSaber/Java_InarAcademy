package chapters.chapter13.Exercise13;

public class Exercise13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1 = new Course("Cyber Security");
        System.out.println("Course Name:\"Cyber Security\"");
        c1.addStudents("Erdem");
        c1.addStudents("Erkam");
        c1.addStudents("Tahir");
        c1.addStudents("Salim");

        Course c2 = c1.clone();
        c2.addStudents("Mahmut");
        c2.addStudents("Gürses");

        System.out.println("\nNumber of students in course1: " + c1.getNumberOfStudents());
        String[] students = c1.getStudents();
        for (int i = 0; i < c1.getNumberOfStudents(); i++){
            System.out.print(students[i] + ", ");
        }

        System.out.println("\n--------------------------");

        System.out.println("Number of students in course2: " + c2.getNumberOfStudents());
        String[] students2 = c2.getStudents();
        for (int i = 0; i < c2.getNumberOfStudents(); i++){
            System.out.print(students2[i] + ", ");
        }
    }
}
