package chapters.chapter10.Exercise23;

public class Exercise10_23 {
    public static void main(String[] args) {
        MyString2 s1 = new MyString2("Elon Musk");
        MyString2 s2 = new MyString2("Deep Blue");
        MyString2 s3 = new MyString2("Alexa");
        MyString2 s4 = new MyString2("AlphaGoZero");

        System.out.println(s1.toString().toUpperCase());

        char[] chars = s2.toChars();
        System.out.println(chars[0]);

        System.out.println(s4.compare(s1.toString()));
        System.out.println(s1.compare(s3.toString()));

        System.out.println(s4.toString().substring(5));

        System.out.println(MyString2.valueOf(s4.compare(s1.toString()) == 1));
        System.out.println(MyString2.valueOf(s1.compare(s4.toString()) == 0));
    }
}