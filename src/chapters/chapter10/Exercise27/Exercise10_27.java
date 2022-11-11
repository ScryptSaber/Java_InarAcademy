package chapters.chapter10.Exercise27;

public class Exercise10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("La Casa De Papel--");
        System.out.println(myStringBuilder1.toString());

        String person = "@El Profesor";
        MyStringBuilder1 myStringBuilder2 = new MyStringBuilder1(person);
        myStringBuilder1.append(myStringBuilder2);

        String tema = myStringBuilder1.toString();
        System.out.println(tema);

        myStringBuilder1.append(4161);
        System.out.println(myStringBuilder1);

        System.out.println(myStringBuilder1.length());
        System.out.println(myStringBuilder1.charAt(11));

        System.out.println(myStringBuilder1.toLowerCase());
        System.out.println(myStringBuilder1);

        MyStringBuilder1 myStringBuilder3 = myStringBuilder1.substring(19, 30);

        System.out.println(myStringBuilder3);
        System.out.println(myStringBuilder1);

    }
}
