package chapters.chapter10.Exercise09;

public class Exercise10_09 {
    public static void main(String[] args) {
        Course inar = new Course("Java-Inar Academy");
        inar.addStudent("Erdem Kamis");
        inar.addStudent("Erkam Imam");
        inar.addStudent("Etka Berk Orman");
        inar.addStudent("Sinan Cetin");
        inar.addStudent("Behlul Ersoz");
        displayStudents(inar.getStudents(), inar.getNumberOfStudents());

        inar.dropStudent("Tahir Gozuacik");
        inar.dropStudent("Sinan Cetin");

        displayStudents(inar.getStudents(), inar.getNumberOfStudents());
    }

    public static void displayStudents(String[] students, int numberOfStudents) {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
        System.out.println("--------------------");
        System.out.println();
    }
}
