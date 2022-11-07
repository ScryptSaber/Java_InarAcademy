package chapters.chapter10.checkpoint10;

public class Checkpoint10_29 {
    public static void main(String[] args) {
        String s = "La Casa De Papel";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.delete(4, 10);
        s = stringBuilder.toString();
        System.out.println(s);
    }
}
