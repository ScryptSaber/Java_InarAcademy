package weeks.week11;

public class TestStudent {
    public static void main(String[] args) {
        Student haluk = new Student("Haluk","Inar",425,"haluk@inar.com");
        haluk.print();
        haluk.setEmail("haluk@gmail.com");
        haluk.print();
    }
}
