package chapters.chapter13.Exercise13;

public class Course implements Cloneable{
    private String courseName;
    private String[] students= new String[10];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudents(String student){
        if (numberOfStudents >= students.length) {
            String[] tempStudent = new String[students.length * 2];
            System.arraycopy(students, 0, tempStudent, 0, students.length);
            students = tempStudent;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student) {
        int index = findTheSpecifiedStudent(student);
        if (index == -1) {
            System.out.printf("There aren't any student named %s in this course.\n", student);
            return;
        }
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }

    public int findTheSpecifiedStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (student.equals((students[i]))) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        students = new String[10];
        numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Course clone() throws CloneNotSupportedException{
        //shallow copy
        Course courseClone = (Course) super.clone();
        //deep copy
        courseClone.students=(String[])students.clone();
        return courseClone;
    }
}
