package chapters.chapter10.Exercise23;

public class MyString2 {
    public char[] chars;

    public MyString2(char[] chars) {
        this.chars = new char[20];
    }

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public int compare(String s) {
        if (chars.length < s.length()) {
            return -1;

        } else if (chars.length == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (chars[i] < s.charAt(i)) {
                    return -1;
                } else if (chars[i] > s.charAt(i)) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return 0;
        }
        return 1;
    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin > chars.length) {
            System.out.println("Invalid substring parameters!");
            System.exit(-1); //It is better to throw an exception, i think..
        }
        char[] newArray = new char[chars.length - begin];

        for (int i = begin; i < newArray.length; i++) {
            newArray[i] = chars[i];
        }
        return new MyString2(newArray);
    }

    public MyString2 toUpperCase() {
        char[] ch = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                ch[i] = (char) (chars[i] - ('a' - 'A'));
            } else {
                ch[i] = chars[i];
            }
        }
        return new MyString2(ch);
    }

    public char[] toChars() {
        return this.chars;
    }

    public static MyString2 valueOf(boolean b) {
        return (b ? new MyString2("true") : new MyString2("false"));
    }

    public String toString() {
        return new String(chars);
    }

}
