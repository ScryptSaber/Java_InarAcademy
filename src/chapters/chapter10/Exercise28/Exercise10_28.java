package chapters.chapter10.Exercise28;

public class Exercise10_28 {
    public static void main(String[] args) {
        char[] chars = {'F', 'e', 'n', 'e', 'r', 'b', 'a', 'h', 'c', 'e'};

        MyStringBuilder2 s = new MyStringBuilder2();
        System.out.println(s);

        MyStringBuilder2 s1 = new MyStringBuilder2("1907");
        MyStringBuilder2 s2 = new MyStringBuilder2(chars);

        System.out.print("Insert s2 into s1 at index 2 --------> ");
        MyStringBuilder2 s3 = s1.insert(2, s2);
        System.out.println(s3);

        System.out.println("Reverse s2 --------------------------> " + s2.reverse().toString());

        System.out.println("Substring of s3 beginning index 10 --> " + s3.substring(7));

        System.out.println("S2 to upper case --------------------> " + s2.toUpperCase());
    }
}
