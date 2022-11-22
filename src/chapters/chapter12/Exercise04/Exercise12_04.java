package chapters.chapter12.Exercise04;

public class Exercise12_04 {
    public static void main(String[] args) {
        try {
            LoanWithException ln1 = new LoanWithException(1, 5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
